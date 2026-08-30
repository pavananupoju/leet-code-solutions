class Solution {

    
     public boolean isint(char ch) 
     {
        return ch >= '0' && ch <='9';
     }





    public int myAtoi(String s) {
        
        int sign =1 ;
        int num =0;
        int i =0 ;

        while(i<s.length() && s.charAt(i)==' ') 
        {
            i++;
        }
        if(i<s.length()) 
        {
            if(s.charAt(i)=='-') 
            {
                sign =-1;
                i++;
                
            }
            else if(s.charAt(i)=='+')
            {  
                sign =1 ;
                i++;

            }
            }
            return logic(s, i, num , sign);
        
    }

        public int logic(String s  , int i , int num , int sign) 
        {    

          if (i == s.length() || !isint(s.charAt(i))) {
            return sign * num;
        }
         


                int a =  s.charAt(i) - '0';

                if(num>(Integer.MAX_VALUE - a)/10 ) 
                {
                    return sign == 1 ?Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                num =  num*10 + a ; 
    
        return logic(s, i+1 , num, sign);
        }


    
}