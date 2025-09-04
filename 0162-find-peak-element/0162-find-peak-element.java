class Solution {
    public int findPeakElement(int[] nums) { 
         int st = 0 ;
        int n =  nums.length ;
        int en  =n-1 ;
        int ans = Integer.MIN_VALUE;
        while(st<en) 
        {
            int mid = (st+en)/2;
            
            if(nums[mid]>nums[mid+1]) 
            {    
                en = mid ;

            }
            else 
            {
                  
                  st =  mid+1;
            }


            }

            return st;
        }
       

        
    }
