import java.util.*;

class Solution {
    public int[] rearrangeArray(int[] nums) {

        HashMap<Integer, Integer> mp = new HashMap<>();

        // Count frequency
        for (int n : nums) {
            mp.put(n, mp.getOrDefault(n, 0) + 1);
        }

        // Get distinct values
        ArrayList<Integer> val = new ArrayList<>(mp.keySet());

        // Sort
        Collections.sort(val);

        ArrayList<Integer> ans = new ArrayList<>();

        // Build answer
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < val.size(); j++) {

                int value = val.get(j);

                if (mp.get(value) > 0) {
                    ans.add(value);
                    mp.put(value, mp.get(value) - 1);
                }
            }
        }

        // Convert ArrayList to int[]
        int[] result = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}