class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder result = new StringBuilder() ;

        int word1ptr = 0 ;
        int word2ptr = 0 ;

        while(word1ptr<word1.length() && word2ptr<word2.length()){
            result.append(word1.charAt(word1ptr));
            result.append(word2.charAt(word2ptr));

            word1ptr++;
            word2ptr++;
        }        

        result.append(word1.substring(word1ptr));
        result.append(word2.substring(word2ptr));
        return result.toString();
    }
}