class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> mp =  new HashMap<>();
        for(int i=0;i<nums.length;i++) 
        {  

            int a = nums[i];
             mp.put(a,mp.getOrDefault(a,0)+1);
            if(mp.get(a)>1) 
            {
                return true;
            }

           
        }
        return false;
        
    }
}