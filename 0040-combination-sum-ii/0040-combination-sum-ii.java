class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) { 

         List<List<Integer>> ans  = new ArrayList<>();
         
        ArrayList<Integer> ds  =  new ArrayList<>();
        Arrays.sort(candidates);

   
       combination(candidates,0, target ,ans,ds );
       return ans;
        
    }

    public void combination(int[] candidates,int index, int target, List<List<Integer>> ans , ArrayList<Integer> ds) 
    {

        if(target ==0) 
        {
            ans.add(new ArrayList<> (ds));
        

        return;
        }
       

      for(int i=index;i<candidates.length;i++) 
      {
        if(i>index && candidates[i]==candidates[i-1]) 
        {
            continue;
        }
        if(candidates[i]>target) 
        {
            break;
        }

        ds.add(candidates[i]);
       combination(candidates ,i+1,target -candidates[i] , ans,ds);
       ds.remove(ds.size()-1);
      }

    }
}