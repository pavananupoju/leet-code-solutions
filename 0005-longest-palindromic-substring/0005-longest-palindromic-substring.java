class Solution {
    int max = 0;
    int st = 0;
    int en = 0;

    public String longestPalindrome(String s) {

        for(int i = 0; i < s.length(); i++) {
            for(int j = i; j < s.length(); j++) {

                if(ispalindrome(s, i, j)) {
                    if((j - i + 1) > max) {
                        max = j - i + 1;
                        st = i;
                        en = j;
                    }
                }
            }
        }
        return s.substring(st, en + 1);
    }

    public boolean ispalindrome(String a, int i, int j) {

        while(i < j) {
            if(a.charAt(i) != a.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
