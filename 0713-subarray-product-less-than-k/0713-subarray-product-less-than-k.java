class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       

       int cnt=0;
       int st =0 ;
       int pro =1;
          if (k <= 1) {
            return 0;
        }
        for(int i=0;i<nums.length;i++) 
        {  
            pro*=nums[i];
           while(pro>=k) 
           {
            pro= pro/nums[st];
            st++;
           }
           cnt =  cnt+ (i - st +1);
        }
        return cnt;
        
    }
}