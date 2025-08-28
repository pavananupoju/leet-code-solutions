class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {                       
      
            List<int[]> intervalList = new ArrayList<>(Arrays.asList(intervals));
          
           intervalList.add(newInterval); 
            Collections.sort(intervalList, (a, b) -> Integer.compare(a[0], b[0])); 
            int prev [] =  intervalList.get(0) ;
             List<int[]> res = new ArrayList<>();
            for(int i=1 ;i <intervalList.size();i++) 
            {
                        int[] interval = intervalList.get(i); 
                        if(prev[1]>=interval[0]) 
                        {
                            prev[1] =  Math.max(prev[1] , interval[1]);
                        }
                        else 
                        {
                              res.add(prev) ;
                              prev =  interval;
                        } 

            }
            res.add(prev) ;
               return res.toArray(new int[res.size()][]);



        
    }
}