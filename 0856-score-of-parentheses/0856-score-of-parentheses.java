class Solution {
    public int scoreOfParentheses(String s) {

        return solve(s, 0 , s.length()-1);
        
    }

    public int solve(String ss , int lft , int rgt) 
    {

        if((rgt-lft)==1) 
        {
            return 1;
        }
        int bal =0 ;
        for(int i=lft;i<=rgt;i++) 
        {   
            if(ss.charAt(i)=='(') 
            {
                bal++;
            }
            else 
            {
                bal--;
            }
            if(bal==0) 
            {
                if(i==rgt) 
                {
                    return 2*solve(ss,lft+1,rgt-1);
                }
                
                    return solve(ss,lft ,i) + solve(ss,i+1,rgt);
                

            }
        }

return 0;
        
    }
}