class Solution {

public double pow(double x , long n) 
{
    if(n==0) 
    {
        return 1.0;
    } 

    if(n%2==0) 
    {
        return pow(x*x , n/2);
    }
  
        return x* pow(x , n-1);
    
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