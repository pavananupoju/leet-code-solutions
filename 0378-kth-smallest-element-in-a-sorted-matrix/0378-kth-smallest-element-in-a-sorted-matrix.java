class Solution {

public int count(int[][] matrix , int target) 
{
     int count =0 ;
     for(int i=0;i<matrix.length;i++) 
     {
        for(int j=0;j<matrix.length;j++) 
        {
            if(target>=matrix[i][j]) 
            {
                count++;
            }
        }
     }
     return count ;
}

    public int kthSmallest(int[][] matrix, int k) { 


        int n =  matrix.length ;
        int l = matrix[0][0];
        int e = matrix[n-1][n-1];
        while(l<e) 
        {
            int mid = l+(e-l)/2;
            int cnt =  count(matrix , mid);

            if(cnt>=k) 

            {
               e =mid; 
            }
            else 
            {
                l = mid+1;
            }
        }
        return l;
        
    }
}