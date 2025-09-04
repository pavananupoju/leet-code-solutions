class Solution {
    public int singleNonDuplicate(int[] nums) {   
 int st = 0 ;
        int n =  nums.length ;
        int en  =n-1 ;
        
        while(st<en) 
        {
            int mid = (st+en)/2; 
             if (mid % 2 == 1) {
                mid--;
            }

            if(nums[mid]==nums[mid+1]) 
            {
                st = mid+2;
            }
            else 
            {
                en = mid;
            }
           
        }
        return nums[en];



    }
}