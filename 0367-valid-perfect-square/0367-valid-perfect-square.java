class Solution {
    public boolean isPerfectSquare(int num) {

    
    long l=1 ;
    long en =  num;
    while(l<=en) 
    {   
        long mid =  l+(en-l)/2 ;
        long sq = mid*mid ;
        if(sq==num) 
        {
            return true;
        }
        if(sq>num) 
        {
            en = mid-1;
        }
        else
         {
            l = mid+1;
         }
    }
       return false; 

        
    }
}