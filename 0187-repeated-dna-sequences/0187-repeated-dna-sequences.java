

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {

        List<String> res = new ArrayList<>();

        if (s.length() < 10) {
            return res;
        }

        Set<String> seen = new HashSet<>();
        Set<String> rep  = new HashSet<>();

        for (int i = 0; i <= s.length() - 10; i++) {
            String sub = s.substring(i, i + 10);

            if (seen.contains(sub)) {
                rep.add(sub);
            } else {
                seen.add(sub);
            }
        }

        res.addAll(rep);
        return res;
    }
}
