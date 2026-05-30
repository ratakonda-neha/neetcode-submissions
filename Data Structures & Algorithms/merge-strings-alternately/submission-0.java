class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder result = new StringBuilder();
        int word1pt = 0;
        int word2pt = 0;

        while(word1pt < word1.length() && word2pt < word2.length()){
            result.append(word1.charAt(word1pt));
            result.append(word2.charAt(word2pt));
            word1pt++;
            word2pt++;

        } 
        result.append(word1.substring(word1pt));
        result.append(word2.substring(word2pt));
        return result.toString(); 
    } 

}