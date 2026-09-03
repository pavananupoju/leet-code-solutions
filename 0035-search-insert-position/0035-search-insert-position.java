class Solution {
    public int searchInsert(int[] nums, int target) {
        int lft =0 ;
        int rgt =  nums.length-1 ;

        while(lft<=rgt) 
        {
             int mid = lft + (rgt - lft) / 2;
            if(nums[mid]>=target) 
            {  
                rgt = mid-1;
                
               
            }
            else 
            {
                lft = mid+1;
            }
        }
        return lft;
        
    }
}