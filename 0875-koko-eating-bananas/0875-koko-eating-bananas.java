class Solution {
    public int minEatingSpeed(int[] piles, int h) {  
        int low =1 ;
        int high =0 ;
        for(int pi : piles) 
        {
            high = Math.max(high,pi);
        }
        int result =0 ;

        while(low<=high) 
        {
            int mid =  low + (high - low) / 2; 
            if(cal(piles,mid)<=h) 
            {  
                result =mid;
                high = mid-1;
                
            }
            else 
            {
                low = mid+1;
            }
        }
        return low;
        
    } 

    private long cal(int[] piles , int k) 
    {
        long hrs =0 ;
        for(int pile:piles) 
        {
           hrs+= Math.ceil((double) pile / k);
        }
        return hrs;
    }
}