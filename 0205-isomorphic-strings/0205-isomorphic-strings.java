class Solution {
    public boolean isIsomorphic(String s, String t) {  

        if(s.length()!=t.length()) 
        {
            return false ;
        }

        HashMap<Character, Character> h_1 =  new HashMap<>();
         HashMap<Character, Boolean> h_2 =  new HashMap<>(); 

         for(int i=0;i<s.length();i++) 
         {
            char ch_1 =  s.charAt(i);
            char ch_2 = t.charAt(i);
            

            if(h_1.containsKey(ch_1)) 
            {
                if(h_1.get(ch_1)!=ch_2) 
                {
                    return false;
                }
            }
            else 
            {
                if(h_2.containsKey(ch_2)==true) 
                {
                    return false;
                }
            }


            h_1.put(ch_1,ch_2);
             h_2.put(ch_2,true);

         }



        return true;
    }
}