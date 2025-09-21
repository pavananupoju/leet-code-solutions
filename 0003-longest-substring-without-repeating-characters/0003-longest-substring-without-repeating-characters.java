class Solution {
    public int lengthOfLongestSubstring(String s) {   

        HashSet<Character>  Charset  =  new HashSet<>() ;
        int maxl = 0 ;
        int left =0  ;
        for(int right =0 ; right<s.length();right++) 
        {
             while(Charset.contains(s.charAt(right))) 
             {
                Charset.remove(s.charAt(left)) ;
                left++ ;
             } 
             Charset.add(s.charAt(right)) ;
             maxl = Math.max(maxl , right - left +1 );
        }
        return maxl;
        
    }
}