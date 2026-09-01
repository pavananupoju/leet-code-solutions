class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
 List<List<Integer>> ans = new ArrayList<>(); 
ArrayList<Integer> ds =  new ArrayList<>();
combination(k,n,1,ds,ans);
return ans;
           
    }

    public void combination(int k , int n,int num , ArrayList<Integer> ds,List<List<Integer>> ans)  
    {
        if(n==0 && k==0) 
        {    
            ans.add(new ArrayList<>(ds));
                return ;
        }

        for(int i=num;i<=9;i++)
        {    
            if (i > n || k <= 0) break;
            ds.add(i);
            combination(k-1,n-i,i+1,ds,ans);
            ds.remove(ds.size()-1);
        }
    }
}