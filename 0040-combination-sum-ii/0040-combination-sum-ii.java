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

        /* we are cheking the elements at each level we are picking the elements and checking the duplicate occurence if it is dulicate we need to skip that element 

        that why we are chekinf i>index -->index is level and i is the current element
        index is 0
        then i loop from --> 0 1 2 3 4 5 6
        0>0 falwe false --> pick 
        i>0 next element i>0 ture we need to i-1 == i
        2>0
        
        
        */


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