class Solution {
    public int longestPalindrome(String s) { 

   /* for the palindromic sting the possible condition 
   we need to cnt the the character frequency 
   the odd frequency should be the middle of the string ex bab here a is the odd frequency and splitting the string in palindromic */

   HashMap<Character , Integer> mp =  new HashMap<>();
   for(char ch : s.toCharArray()) 
   {   
    mp.put(ch , mp.getOrDefault(ch,0)+1);
      
   }
int len =0 ;
boolean odd= false;


   for(int cnt : mp.values()) 
   {
      if(cnt%2==0) 
      {
           len+=cnt;
      }
      else 
      {
        len+=cnt-1;
        odd=true;
      }
   }
   if(odd) 
   {
    len++;
   }
   return len;
        
    }       

   
}