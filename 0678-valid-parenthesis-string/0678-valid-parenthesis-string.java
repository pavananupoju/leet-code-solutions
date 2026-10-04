class Solution {
    public boolean checkValidString(String s) {
        int cmax =0 ;
        int cmin =0 ;
        
       for(int i=0;i<s.length();i++) 
       {
        if(s.charAt(i)=='(') 
        {
            cmax++;
            cmin++;
        }
        else if(s.charAt(i)==')') 
        {
            cmax--;
            cmin--;
        }
        else if(s.charAt(i)=='*') 
        {
            cmax++;
            cmin--;
        }
        if(cmax<0) 
        {
            return false;
        }
cmin = Math.max(cmin,0);

       }
        return cmin==0;
    }
}