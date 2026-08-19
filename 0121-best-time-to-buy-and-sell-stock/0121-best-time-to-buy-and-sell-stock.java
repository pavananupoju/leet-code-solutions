class Solution {
    public int maxProfit(int[] prices) {
    

    int currbuy = prices[0];
    int max =0;

    for(int i=1;i<prices.length;i++) 
    {
         if(currbuy>prices[i]) 
         {
            currbuy = prices[i];
         }
         int pro =  prices[i] - currbuy;
         max = Math.max(max, pro);
    }

return max;
        
    }
}