class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int ans []= new int[seq.length()];
int dp=0;
        for(int i=0;i<seq.length();i++) 
        {
            if(seq.charAt(i)=='(') 
            {
                 dp++;
                if(dp%2==1) 
                {
                    ans[i]=0;
                }
                else 
                {
                    ans[i]=1;
                }
            }
            else 
            {
                if(dp%2==1) 
                {
                     ans[i]=0;
                }
                else 
                {
                    ans[i]=1;
                }
                dp--;
            }
        }
        return ans;
    }
}