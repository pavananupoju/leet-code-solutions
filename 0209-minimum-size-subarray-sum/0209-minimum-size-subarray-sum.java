class Solution {
    public int minSubArrayLen(int target, int[] nums) {  


        int p1 =0 ;
        int sum =0 ;
        int min = Integer.MAX_VALUE ;

        for(int i=0;i<nums.length;i++) 
        {
            sum+=nums[i] ;
            while(sum>=target) 
            {
                 if((i-p1+1)<min) 
                 {
                    min = i-p1+1;
                 }
                 sum = sum - nums[p1];
                 p1++;
            }
        }
        return min!= Integer.MAX_VALUE ?  min :0;
        
    }
}