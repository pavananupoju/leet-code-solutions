class Solution {
    public int[] intersection(int[] nums1, int[] nums2) { 
        int a = nums1.length ;
        int b =  nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1 =0 ;
        int p2=0;
        HashSet<Integer> hs =  new HashSet<>();
        while(p1<a && p2<b) 
        {
            if(nums1[p1]==nums2[p2]) 
            {
                hs.add(nums1[p1]);
                p1++;
                p2++;

            }
            else if(nums1[p1]<nums2[p2]) 
            {
                p1++;
            }
            else 
            {
                p2++;
            }
        }
        int k = hs.size();
        int [] res =  new int[k];
        int curr=0 ;
        for(int x : hs) 
        {
            res[curr] = x ;
            curr++;
        }
        return res;
    }
}