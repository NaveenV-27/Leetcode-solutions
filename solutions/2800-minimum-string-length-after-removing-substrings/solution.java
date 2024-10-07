class Solution {
    public int minLength(String str) {
        Stack<Character> s = new Stack<>();
        for(char ch:str.toCharArray()) {
            if(!s.isEmpty() && ((s.peek()=='A' && ch=='B') || s.peek()=='C' && ch=='D')) {
                s.pop();
            } else {
                s.push(ch);
            }
        }
        return s.size();
    }
}
