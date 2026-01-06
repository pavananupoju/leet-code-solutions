class Solution {

       static final long MOD = 1000000007;
    public int countGoodNumbers(long n) {    

        long ecnt  =  (n+1)/2 ;
        long ocnt =  n/2 ;
        long ew = power(5 , ecnt) ;
         long ow = power(4 , ocnt) ;
         return (int) ((ew*ow)%MOD);

      
    }

    public long power(long base ,long exp) 
    {
        long result =1 ;
        while(exp>0) 
        {
            if(exp%2 == 1) 
            {
                result = (result * base) % MOD;
                exp = exp-1;
            } 
                base = (base * base) % MOD; 
        exp = exp / 2;
        }
        return result;
    }
}