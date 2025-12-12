class Solution {
    public boolean canJump(int[] nums) {
        int p1 =0 ;
       
        for(int i=0;i<nums.length;i++) 
        {  
            if(i>p1) 
            {
                return false ;

            } 
            p1 =  Math.max(p1 , nums[i]+i) ;
            if(p1>=nums.length-1) 
            {
                return true;
            }
        }
        return false;
    }
}