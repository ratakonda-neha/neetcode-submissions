class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character , Integer> string_s = new HashMap<>();
        HashMap<Character , Integer> string_t = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i ++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            string_s.put(c1 , string_s.getOrDefault(c1,0) +1);
            string_t.put(c2 , string_t.getOrDefault(c2,0) +1);

        }
        return string_s.equals(string_t);
    }
 }

