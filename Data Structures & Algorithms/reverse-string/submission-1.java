class Solution {
    public void reverseString(char[] s) {
       //Using Stack - extra memeory
        Stack<Character> stack = new Stack<>();
        for (char c : s){
            stack.push(c);
        }
        int i =0;
        while(!stack.isEmpty()){
            s[i]=stack.pop();
            i++;
        }
        }
    }
