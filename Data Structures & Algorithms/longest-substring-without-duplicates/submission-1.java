class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> map = new HashSet<>();
        int max_count = 0 ;
        int left = 0;

        for(int i = 0; i < s.length(); i++){
            
            while(map.contains(s.charAt(i))){
                map.remove(s.charAt(left));
                left++ ;
            }    
            map.add(s.charAt(i));
            max_count = Math.max(max_count , i - left + 1);
        }
        return max_count;
    }
}