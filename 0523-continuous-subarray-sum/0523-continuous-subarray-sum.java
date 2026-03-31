class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {   


        int prefix[] =  new int[nums.length];
        prefix[0] = nums[0];

        for(int i=1;i<nums.length;i++) 
        {
            prefix[i] = prefix[i-1] + nums[i];
        }

        HashMap<Integer , Integer> mp =  new HashMap<>();
        mp.put(0,-1);

        for(int i=0;i<nums.length;i++) 
        {
             int rem =  prefix[i] %k ;

             if(mp.containsKey(rem)) 
             {
                if(i- mp.get(rem) >1) 
                {
                    return true;
                }
             }
             else {
                mp.put(rem, i);
             }
        }



return false;
        
    }
}