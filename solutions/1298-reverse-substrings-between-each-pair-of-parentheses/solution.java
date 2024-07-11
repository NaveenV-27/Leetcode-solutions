class Solution {
    private String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    public String reverseParentheses(String str) {
        Stack<Integer> si = new Stack();
        for(int i=0; i<str.length(); i++) { 
            char c = str.charAt(i);
            if(c == '(') {
                si.push(i);
            }
            else if(c == ')') {
                str = str.substring(0, si.peek()) + reverse(str.substring(si.pop(), i)) + str.substring(i);
            }
        }
        int i = 0;
        while(i<str.length()) {
            if(str.charAt(i) == '(' || str.charAt(i) == ')') {
                str = str.substring(0, i) + str.substring(i+1); 
            } else i++;
        }
        return str;
    }
}
