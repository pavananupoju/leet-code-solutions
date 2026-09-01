class Solution {
    public List<String> generateParenthesis(int n) {

        ArrayList<String> ans  =  new ArrayList<>();

        int length =  2*n;

        String s = "";  

        generate(s , length, ans);
       
       return ans;

        
    }
    public void  generate(String s , int length, ArrayList<String>  ans) 
    {
        if(s.length()==length) 
        {
            if(isvalid(s)) 
            {
                ans.add(s);
            }
            return;
        }

        generate(s+ "(" , length,ans);
        
        generate(s+")" , length,ans);

    }


   public boolean isvalid(String s) 
   {
       int cnt=0 ;
      for(char ch : s.toCharArray()) 
      {
        if(ch=='(') 
        {
            cnt++;
        }
        else 
        {
            cnt--;
        }
        if(cnt<0) 
        {
            return false;
        }
      }

       return cnt==0;
   }


}   


 