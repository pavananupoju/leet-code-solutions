class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {  
        int cnt =0;
        
        for(int i=0;i<flowerbed.length;i+=2) 
        {
            if(flowerbed[i]==0) 
            {
                 cnt += 1;
            }
        }
        if(cnt>=n) 
        {
            return true ;
        }
        else 
        {
            return false;
        }
        
    }
}