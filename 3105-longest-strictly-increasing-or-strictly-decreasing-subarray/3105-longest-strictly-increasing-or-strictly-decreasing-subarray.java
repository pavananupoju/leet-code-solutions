class Solution {
    public int longestMonotonicSubarray(int[] nums) {


        int i =0 ;
        int max =1 ;
        int direction =0;

        for(int j=1;j<nums.length;j++) 
        {
            int currdirection =0 ;
            if(nums[j]>nums[j-1]) 
            {
                currdirection = 1;
            }
            else if(nums[j]<nums[j-1]) 
            {
                currdirection =-1;
            }
            if(currdirection ==0) 
            {
                i=j;
                direction = 0;
            }
            else if(direction!=0 && direction!=currdirection) 
            {
                i = j-1;
                direction = currdirection;
            }
            else 
            {
                direction = currdirection;
            }
              max = Math.max(max,j-i+1);
        }
      
return max;
    }
    
}