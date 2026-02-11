class Solution {
    public int minSubArrayLen(int target, int[] nums) {
          
       
        int minlen = Integer.MAX_VALUE;

       int cursum =0 ;
      
       int i=0 ;
       for(int j=0;j<nums.length;j++) 
       {
             cursum+=nums[j] ;
              
              while(cursum>=target) 
              {
                if((j -i + 1) < minlen) 
                {
                    minlen =  j-i+1; 

                } 
                cursum =  cursum -  nums[i] ;
                i++;
              }


       }

       return minlen!= Integer.MAX_VALUE ?  minlen :0;

    }
}