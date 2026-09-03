

        class Solution {
    public int[] searchRange(int[] nums, int target) { 
        int ans[] = {-1, -1};
        if (nums.length == 0) {
            return ans;
        }
         int firstt = first(nums, target);
          if (firstt == nums.length || nums[firstt] != target) {
            return new int[]{-1, -1};
        }
       
        ans[0] = first(nums, target);
        
        ans[1] = second(nums, target)-1;
        return ans;
    }

    public int first(int[] nums, int target)
     {
        int st = 0;
        int en = nums.length - 1;
      
        while (st <= en)
         {
            int mid = st+(en-st) / 2;
            if (nums[mid] >= target) {
                 
                 en =mid-1;
            }
            else {
                st = mid + 1;
            }
        }
        return st;
    }

    public int second(int[] nums, int target)
     { 


        int st = 0;
        int en = nums.length - 1;
      
        while (st <= en)
         {
            int mid = st+(en-st) / 2;
            if (nums[mid] > target) {
                 
                 en =mid-1;
            }
            else {
                st = mid + 1;
            }
        }
        return st;
}
        
    
}