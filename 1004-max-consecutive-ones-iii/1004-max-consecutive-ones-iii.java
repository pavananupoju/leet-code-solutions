class Solution {
    public int longestOnes(int[] nums, int k) {  


        int zcnt =0 ;
        int st =0 ;
        int max = 0;
        for(int en =0 ;en<nums.length;en++) 
        {
            if(nums[en]==0) 
            {
                zcnt++;
            } 
            while(zcnt>k) 
            {
                if(nums[st]== 0) 
                {
                    zcnt--;
                }
                st++;
            }



            max =  Math.max(max,en-st+1);
        }
            

return max;

    }
}