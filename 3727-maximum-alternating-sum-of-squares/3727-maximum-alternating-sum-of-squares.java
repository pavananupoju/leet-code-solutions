class Solution {
    public long maxAlternatingSum(int[] nums) {  
          
          long [] arr  =  new long[nums.length];
          for(int i=0;i<nums.length;i++) 
          {
            arr[i]=Math.abs(nums[i]);
          }
          Arrays.sort(arr);

        int n =nums.length;
        long sc =0 ;

        for(int i=0;i<n/2;i++) 
        {    
           sc-=arr[i]*arr[i];
        }
        for(int i=n/2;i<n;i++) 
        {
            sc+=arr[i]*arr[i];
        }
        return sc;
        
    }
}