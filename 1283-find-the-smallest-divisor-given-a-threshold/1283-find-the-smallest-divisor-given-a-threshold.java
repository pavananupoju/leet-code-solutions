class Solution {
    public int smallestDivisor(int[] nums, int threshold) {


        int low =1 ;
        int high = 0 ;  

        for(int di : nums) 
        {
            high =  Math.max(di , high);
        } 

        while(low<=high) 
        {
              
              int mid = low + (high - low) /2;
              if(div(nums, mid)<=threshold) 
              {
                high = mid-1;
              } 
              else 
              {
                low = mid+1 ;

              }

        }
        return low ;

        
    }

    public int div(int arr[] , int ans) 
    {   
        int res = 0;
        for(int a :  arr) 
        {
           res+=(a+ans-1) / ans;
        }
        return res;
    }
}