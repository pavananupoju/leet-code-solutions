class Solution {
    public int lastRemaining(int n) {  

        int head =1;
        int steps =1;
        int rem = n;
        boolean lft =true;
        while(rem>1) 
        {  
            if(lft || rem%2==1) 
            {
                head = head+steps;
                
            }
            rem = rem/2;
            steps = steps*2;
            lft =!lft;

        }
        return head;
        
    }
}