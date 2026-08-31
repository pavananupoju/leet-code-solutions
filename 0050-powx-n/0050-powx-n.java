class Solution {

public double pow(double x , long n) 
{
    if(n==0) 
    {
        return 1.0;
    } 


    /* in recursion when the base case is true it will brak the recursive calls and again it back track each and every recursive call       
    
  half is very simila
    
    half is to store the result of the smaller recursive problem, so we can reuse it instead of calculating the same power twice.
    */


 double half =  pow(x, n/2);
    if(n%2==0) 
    {
        return half*half;
    }
  
        return x* half*half;
    
}

    public double myPow(double x, int n) { 

       
        long a  = n;
        if(n<0) 
        {   
           return 1.0 / pow(x,-a);

        } 
        return pow(x , a);
        
    }
}