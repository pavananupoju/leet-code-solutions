
class Solution {
    public int minInsertions(String s) {
        int open = 0;
        int insert = 0;
        int index = 0;

        while (index < s.length()) {
            if (s.charAt(index) == '(') {
                open++;
                index++;
            } else {
                // Check whether the next character is ')'
                if (index + 1 < s.length() && s.charAt(index + 1) == ')') {
                    index += 2;
                } else {
                    // Insert a missing ')'
                    insert++;
                    index++;
                }

                // Match the closing pair with '('
                if (open > 0) {
                    open--;
                } else {
                    // Insert a missing '('
                    insert++;
                }
            }
        }

        insert += open * 2;
        return insert;
    }
}
