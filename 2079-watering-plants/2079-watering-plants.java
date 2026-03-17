class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        
        int cap =  capacity ;
        int st=0;
        for(int i=0;i<plants.length;i++) 
        {
            if(cap>=plants[i]) 
            {  
                st++;
                cap =  cap-  plants[i];

            }
            else 
            {  
                     st +=  2*i+1;
            cap = capacity-plants[i];

            }
        }
        return st;
    }
}