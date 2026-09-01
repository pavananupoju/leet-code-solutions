class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<Integer> ds =  new ArrayList<>();
         List<List<Integer>> ans  =  new ArrayList<>();
         Arrays.sort(nums);

         combination(nums , ds , ans, 0);
return ans;
    }

    public void combination(int[] nums,ArrayList<Integer> ds, List<List<Integer>> ans ,int idx) 
    {

        ans.add(new ArrayList<>(ds)) ; 

        for(int i=idx;i<nums.length;i++) 
        {
            if(i>idx && nums[i]==nums[i-1]) 
            {
                continue;
            }
            ds.add(nums[i]);
            combination(nums,ds,ans,i+1);
            ds.remove(ds.size()-1);
        }

    }
}