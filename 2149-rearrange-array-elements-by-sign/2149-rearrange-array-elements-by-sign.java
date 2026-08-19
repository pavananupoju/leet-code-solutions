class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p1=0 ;
        int p2=1 ;
        int p =  nums.length;
        int ans[] =  new int[p];
        for(int i=0;i<nums.length;i++) 
        {
            if(nums[i]>=0) 
            {
                ans[p1]= nums[i];
                p1+=2;
            }
            else 
            {
                ans[p2]= nums[i];
                p2+=2;
            }
        }
        return ans;
        
    }
}