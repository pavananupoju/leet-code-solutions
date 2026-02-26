class Solution {
    public int findLHS(int[] nums) {

        Arrays.sort(nums);
        int j=0 ;
        int len =0;
        for(int i=0;i<nums.length;i++) 
        {
            while((nums[i] - nums[j])>1) 
            {
                j++;
            }

            if((nums[i]-nums[j])==1) 
            {
               len = Math.max(len , i-j +1);
            }
        }
        return len ;
        
    }
}