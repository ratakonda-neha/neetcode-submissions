// Sorting Solution
class Solution {
    public boolean isAnagram(String s, String t) {
        //Check if they are the same length , return false otherwise

        if (s.length() != t.length()){
            return false;
        }
    
    // Sort both arrays 

    char[] string_s = s.toCharArray();
    char[] string_t = t.toCharArray();
    Arrays.sort(string_s);
    Arrays.sort(string_t);
    return Arrays.equals(string_s, string_t);
}}