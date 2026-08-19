class Solution {
    public int lengthOfLongestSubstring(String s) { 
  
HashSet<Character> hs =  new HashSet<>();

int lft =0 ;
int max=0;

for(int i=0;i<s.length();i++) 
{   

    while(hs.contains(s.charAt(i))) 
    {
        hs.remove(s.charAt(lft));
        lft++;
    }
    max = Math.max(max , i-lft+1);

    hs.add(s.charAt(i));
}





return max;

    }
}