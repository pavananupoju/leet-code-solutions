class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        String s ="";
        int len = 2*n;
        int o =0 ;
        int c=0;
        genpra(s,len,ans,o,c,n );
        return ans;

    }
    public void  genpra(String s , int length ,   ArrayList<String> ans,int o , int c,int n) 
    {
        if(s.length() == length ) 
        {
           
                ans.add(s);
            
            return ;
        } 
        if(o<n) 
        {
        genpra(s+"(",length,ans,o+1,c,n); 
        }
        if(c<o) 
        {
         genpra(s+")",length,ans,o,c+1,n); 
        }
    }
  
    
}