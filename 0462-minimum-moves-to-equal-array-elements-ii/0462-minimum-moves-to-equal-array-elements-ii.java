class Solution {
    public int minMoves2(int[] nums) {

        Arrays.sort(nums);
        int median = nums[nums.length /2] ;
        int mv =0 ;
        for(int i=0;i<nums.length;i++) 
        {
            mv +=Math.abs(nums[i]- median);
        }
return mv;
        
    }
}