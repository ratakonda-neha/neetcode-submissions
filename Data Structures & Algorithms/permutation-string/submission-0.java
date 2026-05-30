class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }

        HashMap<Character,Integer> s1map = new HashMap<>();
        HashMap<Character,Integer> s2map = new HashMap<>();

        for(int i = 0 ; i <s1.length() ; i++){
            s1map.put(s1.charAt(i), s1map.getOrDefault(s1.charAt(i),0)+1);
            s2map.put(s2.charAt(i), s2map.getOrDefault(s2.charAt(i),0)+1);
        }

        if(s1map.equals(s2map)){
            return true;
        }

        int left = 0;
        for(int right = s1.length() ; right < s2.length() ; right++){
            s2map.put(s2.charAt(right), s2map.getOrDefault(s2.charAt(right),0)+1);
            s2map.put(s2.charAt(left), s2map.get(s2.charAt(left))-1);

            if(s2map.get(s2.charAt(left)) == 0){
                s2map.remove(s2.charAt(left));
            }

            left++;

            if(s1map.equals(s2map)){
            return true;
            }
        }
    return false;
    }
}