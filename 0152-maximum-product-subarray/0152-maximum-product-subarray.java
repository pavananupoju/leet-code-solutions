class Solution {
    public int maxProduct(int[] nums) {     
        int pre =0 ;
        int suf =0 ;
       int ans = Integer.MIN_VALUE;
        int n = nums.length ;
        for(int i =0;i<nums.length;i++) 
        {      
            if(pre == 0) 
            {
                pre =1;
            }
             if(suf == 0) 
            {
                suf =1;
            }
           
            pre*=nums[i] ;
            suf*=nums[n-1-i]; 
            ans  =  Math.max(ans , Math.max(pre , suf)) ;
        } 
        return ans;

        
    }

}