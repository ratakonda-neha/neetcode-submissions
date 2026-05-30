

class Solution {
    public boolean isAnagram(String s, String t) {
        // Check if they are the same length
        if (s.length() != t.length()) {
            return false;
        }

        // Create frequency maps for both strings
        HashMap<Character, Integer> string_s = new HashMap<>();
        HashMap<Character, Integer> string_t = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            string_s.put(s.charAt(i), string_s.getOrDefault(s.charAt(i), 0) + 1);
            string_t.put(t.charAt(i), string_t.getOrDefault(t.charAt(i), 0) + 1);
        }

        // Compare both maps
        return string_s.equals(string_t);
    }
}
