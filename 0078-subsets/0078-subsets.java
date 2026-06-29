class Solution {
    public List<List<Integer>> subsets(int[] nums) { 
          List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        createsub(nums, 0, res, subset);
        return res;        
    }

    public void createsub(int [] nums , int index ,  List<List<Integer>> res , List<Integer> subset) 
    {
        if(index == nums.length) 
        {
            res.add(new ArrayList<>(subset));
            return ;
        }
        subset.add(nums[index]) ;
        createsub(nums , index+1 , res , subset) ;
        subset.remove(subset.size()-1) ;
        createsub(nums, index+1, res, subset);
    }
}