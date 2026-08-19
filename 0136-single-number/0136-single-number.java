class Solution {
    public int singleNumber(int[] nums) {

       
        for(int i=0;i<nums.length;i++) 
        { 
             boolean fnd  =  false ;
           for(int j=0;j<nums.length;j++) 
           {
            if(i!=j && nums[i]==nums[j]) 
            {
                fnd = true ;
                break;  
            }
           }
           if(!fnd) 
           {
            return nums[i];
           }
        }
        return -1;
    }
}