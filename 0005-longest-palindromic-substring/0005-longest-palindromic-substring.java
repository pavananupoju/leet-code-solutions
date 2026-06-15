class Solution {
    public String longestPalindrome(String s) {   

        int max =0 ;
        int st =0 ;
        int en =0 ;
        for(int i=0;i<s.length();i++) 
        {
            for(int j=i;j<s.length();j++) 
            {
                if(isPalin(s, i,j)) 
                {
                    if((j-i+1)>max) 
                    {
                        max = j-i+1;
                        st =i ;
                        en = j;
                    }
                }
            }
        }
        return s.substring(st,en+1);

        
    }

    public boolean isPalin(String s , int i , int j) 
    {
             while(i<j) 
              
              {
                if(s.charAt(i)!=s.charAt(j)) 
                {
                    return false;
                }
                i++;
                j--;
              }
              return true;
    }
}