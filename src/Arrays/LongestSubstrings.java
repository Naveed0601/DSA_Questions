package Arrays;

import java.util.HashMap;

class LongestSubstrings {
    public static int LongestSubstring(String s) {
        int maxLength = 0;
        int i = 0, j = 0;

        // HashMap to store the frequency of characters
        HashMap<Character, Integer> mp = new HashMap<>();
        int n = s.length();

        while (j < n) {
            mp.put(s.charAt(j), mp.getOrDefault(s.charAt(j), 0) + 1);

            if (mp.size() == j - i + 1) {
                maxLength = Math.max(maxLength, j - i + 1);
            } else {
                while (mp.size() < j - i + 1) {
                    mp.put(s.charAt(i), mp.get(s.charAt(i)) - 1);
                    if (mp.get(s.charAt(i)) == 0) {
                        mp.remove(s.charAt(i));
                    }
                    i++;
                }
            }
            j++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = LongestSubstring(s);
        System.out.println(result);  // Output the result
    }
}
