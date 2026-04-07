class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> mp =  new HashMap<>();
        for(int i=0;i<nums.length;i++) 
        {  

            int a = nums[i];

            if(mp.containsKey(a)) 
            {
                  return true;
            }
             mp.put(a,mp.getOrDefault(a,0)+1);
           
           
        }
        return false;
        
    }
}