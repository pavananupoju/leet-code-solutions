class Solution {
    public int maxRepeating(String sequence, String word) {
         
         String temp =  word ;
         int cnt =0 ;
         while(sequence.contains(temp)) 
         {
            cnt++;
            temp+=word;
         }
       
        return cnt;
    }
}