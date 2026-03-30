class Solution {
    public int subarraySum(int[] nums, int k) { 
 
 int cnt =0 ;

 HashMap<Integer , Integer> mp =  new HashMap<>();
 mp.put(0 , 1);


 int to =0 ;
 for(int n : nums) 
 {
    to+=n ;
    if(mp.containsKey(to - k)) 
    {
        cnt+=mp.get(to - k);
    }

    mp.put(to , mp.getOrDefault(to , 0)+1);
 }

 return cnt;

    }
}