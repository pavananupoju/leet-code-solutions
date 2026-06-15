class Solution {
    public String removeOuterParentheses(String s) {
         

    int c=0 ;
  StringBuilder sb = new StringBuilder();
    for(char ch : s.toCharArray()) 
    {
         if(ch=='(' && c++>0) 
         {
            sb.append(ch);
         }
         if(ch==')' && c-->1) 
         {
            sb.append(ch) ;
         }
    } 
    return sb.toString();                                          


                                               

    }
}