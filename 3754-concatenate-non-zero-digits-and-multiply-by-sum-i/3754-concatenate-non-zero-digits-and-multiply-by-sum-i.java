class Solution {
    public long sumAndMultiply(int n) {
        int sum =0; 
        int p=1 ;
        int re = 0;
        
        while(n>0) 
        {
            int r =  n%10;
            if(r!=0) 
            {
                 re =  r * p + re ;
                sum += r;
                p*=10;

            }
            n = n/10;
        }
        
        return(long) re *sum ;

    }
}