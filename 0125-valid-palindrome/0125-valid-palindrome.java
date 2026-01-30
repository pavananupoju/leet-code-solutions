class Solution {
    public boolean isPalindrome(String s) { 

        s =  s.toLowerCase().replaceAll("[^a-z0-9]","");
        int st=0;
        int en =  s.length()-1;
        while(st<en) 
        {
            if(s.charAt(st)!=s.charAt(en)) 
            {
                return false;
            }
            st++;
            en--;
        }
        return true;
        
    }
}