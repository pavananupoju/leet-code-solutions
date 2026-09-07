class Solution {
    public int arrangeCoins(int n) { 
    int c =n;
    int r=0 ;
    for(int i=1;i<=n;i++) 
    {
        if(c>=i) 
        {
            c=c-i;
            r+=1;
        }
        else 
        {
            break;
        }
    }
return r;
    }
}