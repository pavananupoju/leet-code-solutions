class Solution {
    public int longestSubstring(String s, int k) {
          
          if (s.length() < k) {
            return 0;
        }
        int freq[] =  new int[26] ;
        for(int i=0;i<s.length();i++) 
        {
            freq[s.charAt(i)- 'a']++;
        }

        for(int i=0;i<s.length();i++) 
        {
            char ch  =  s.charAt(i);
            if(freq[ch - 'a']<k) 
            {
                 int lft =  longestSubstring(s.substring(0,i),k);
                 int rgt = longestSubstring(s.substring(i+1),k);
                 int max =  Math.max(lft,rgt);
                 return max;
            }
            
        }
        return s.length();
    }
}