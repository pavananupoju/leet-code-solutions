class Solution {
    public int characterReplacement(String s, int k) { 


int freq[] = new int[26];
int maxfreq =0 ;
int ans =0 ;
int lft=0;
for(int rgt =  0 ; rgt<s.length();rgt++) 
{
    char ch  =  s.charAt(rgt);
    freq[ch - 'A']++;
    maxfreq = Math.max(maxfreq , freq[ch - 'A'] );
    while((rgt - lft +1) - maxfreq > k) 
    {
        freq[s.charAt(lft) - 'A']--;
        lft++;
    
    }
    ans = Math.max(ans , rgt - lft + 1);

}
return ans;

        
    }
}