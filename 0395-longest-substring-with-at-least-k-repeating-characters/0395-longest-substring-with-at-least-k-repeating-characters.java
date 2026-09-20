class Solution {
    public int longestSubstring(String s, int k) { 

       int max=0;

       for(int i =0 ;i<s.length();i++) 
       {
        int freq[]  =  new int[26];
        for(int j=i;j<s.length();j++) 
        {
            freq[s.charAt(j) - 'a']++;

            boolean fnd =  true;

            for(int x = 0;x<26;x++) 
            {
               if(freq[x]<k && freq[x]>0) 
               {
                   fnd = false;
                   break;
               }
            }
            if(fnd) 
            {
               max = Math.max(max, j - i + 1);

            }
        }

       }
       return max;

    }
}