class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {     
        
        int to = 0; 
        if(duration == 0) 
        {
            return 0;
        }
        for(int i=0;i<timeSeries.length-1; i++) 
        {
            to+= Math.min(timeSeries[i+1] - timeSeries[i] ,  duration);
        }
        return to + duration ;

        
        
    }
}