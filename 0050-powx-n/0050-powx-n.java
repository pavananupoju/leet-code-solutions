class Solution {
    public double myPow(double x, int n) {  

 long exp = n;
double ans  = 1.0 ;
if(exp<0) 
{
    x=1/x;
    exp =-exp;
}
while(exp>0) 
{
    if(exp%2==1) 
    {
        ans*=x;
        exp= exp-1;
    }
    else 
    {   
        exp=exp/2;
        x=x*x ;

    }
 
}
   return ans;
    
         

          

           

    }   
    
}