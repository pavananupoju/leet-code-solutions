class Solution {
    public int lengthOfLongestSubstring(String s) {
        

        
    HashSet<Character>  hs =  new HashSet<>();
     if(s.length() ==0) 
     {
        return 0;
     }

     int max= 0 ;
     int j=0 ;
    for(int i=0;i<s.length();i++) 
    {
             
            while(hs.contains(s.charAt(i))) 
            {
                hs.remove(s.charAt(j));
                j++;
              
            }


        hs.add(s.charAt(i));
          max =  Math.max(max ,  i-j+1);
    }
    return max;


    }
}