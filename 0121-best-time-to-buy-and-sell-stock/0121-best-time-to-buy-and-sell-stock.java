class Solution {
    public int maxProfit(int[] prices) { 

        int curr_p = prices[0];
        int max =0;
        for(int i=1;i<prices.length;i++) 
        {    
            if(curr_p>prices[i]) 
            {
                curr_p=prices[i];
                
            }
            else 
            {
                int pro =  prices[i]- curr_p;
                max =  Math.max(max,pro);
            }
            

        }
        return max;
        
    }
}