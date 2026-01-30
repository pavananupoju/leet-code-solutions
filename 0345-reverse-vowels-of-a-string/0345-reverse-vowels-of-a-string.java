class Solution {
    public String reverseVowels(String s) { 

        int st =0 ;
        int en = s.length()-1;
        char[] word =  s.toCharArray();
        String vowels = "aeiouAEIOU";

        while(st<en) 
        {
            while(st<en && vowels.indexOf(word[st])==-1) 
            {
                st++;
            } 
             while(st<en && vowels.indexOf(word[en])==-1) 
            {
                en--;
            } 
            char temp = word[st] ;
            word[st]= word[en] ;
            word[en] = temp ;
            st++;
            en--;
        } 

        String ans  = new String(word);
        return ans;
    }
}