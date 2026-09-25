class Solution {
    public int countIntersectingIntervals(int[][] arr) {
        int cnt =0 ;
        for(int i=0;i<arr.length;i++) 
        {
            for(int j=i+1;j<arr.length;j++) 
            {
               if (arr[i][0] <= arr[j][1] && arr[j][0] <= arr[i][1]) {
            cnt++;
        }
            }
        }
        return cnt;
        
    }
}