class Solution {
    public int maximumProduct(int[] nums) {   
  
  int n =  nums.length ;
   Arrays.sort(nums);
   
   int op1  =  nums[n-1]*nums[n-2]*nums[n-3] ;
   int op2 =  nums[0]*nums[1]*nums[n-1];
   int ans =  Math.max(op1,op2) ;
   return ans;



    }
}