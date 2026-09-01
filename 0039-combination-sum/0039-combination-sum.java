class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) { 

        List<List<Integer> >ans  = new ArrayList<>();  


       ArrayList<Integer> ds =  new ArrayList<>();

   combinations(0, candidates ,target , ds , ans);

    return ans;


    } 

public void combinations(int index ,int[] candidates, int target , ArrayList<Integer> ds , List<List<Integer> >ans )  
{   

    if( index ==  candidates.length   ) 
    {     
        if(target==0) 
        {
        
         ans.add(new ArrayList<>(ds));
       
        }
         return ;
    } 

    if(candidates[index]<=target) 
    {  ds.add(candidates[index]);
       combinations(index,candidates ,target -candidates[index] , ds ,ans);
       ds.remove(ds.size()-1);
    }

 combinations(index+1,candidates ,target , ds ,ans);

   
}
   
    
}