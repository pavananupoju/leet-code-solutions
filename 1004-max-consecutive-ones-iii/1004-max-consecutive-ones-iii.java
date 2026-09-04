class Solution {
    public int longestOnes(int[] nums, int k) {

        int zc =0 ;
        int max =0 ;
        int st =0 ;
        for(int i=0;i<nums.length;i++) 
        {
            if(nums[i]==0) 
            {
                zc++;
            } 

            /* we need to use sliding window approach , we need to count the zeroes if zeroes is creater than given k value we need to move the st point forward ubntil we found zeroes and satisfy the condition*/
            while(zc>k) 
            {
                if(nums[st]==0) 
                {
                    zc--;
                }
                st++;
            }
            max =  Math.max(max, i-st+1);

        }

        return max;
    }
}