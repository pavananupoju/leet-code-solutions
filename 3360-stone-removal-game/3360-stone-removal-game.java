class Solution {
    public boolean canAliceWin(int n) {

      int stones =n ;
      int rem = 10 ;
      boolean alice = true;
      while(stones>=rem) 

    {    

        /* for every iteration the person will remove lesser then previous person i.e rem--*/
        
        stones = stones -rem ;
        rem--;
        alice = !alice;


    }

    return !alice;

        
    }
}