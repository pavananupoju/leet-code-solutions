class Solution {
    public int search(int[] nums, int target) {
        int st=0 ,en=nums.length-1 ;
        while(st<=en)
        {
            int mid= (st+en)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            if(nums[mid]<target)
            {
                st=mid+1;
            }
            else 
            {
                en=mid-1;
            }
        }
        return -1;
        
    }
}