class Solution {
    public List<String> generateParenthesis(int n) {

        ArrayList<String> ans  =  new ArrayList<>();

      

        String s = "";  

        generate(s , 0, 0,n,ans);
       
       return ans;

        
    }
    public void  generate(String s , int lft , int rgt,int n, ArrayList<String>  ans) 
    {
        if(s.length()==2*n) 
        {
            
                ans.add(s);
            
            return;
        }
          
          if(lft<n) 
          {
        generate(s+ "(" ,lft+1,rgt, n,ans); 
          }
        
        if(rgt<lft)
        generate(s+")",lft,rgt+1 , n,ans);

    }


}   


 