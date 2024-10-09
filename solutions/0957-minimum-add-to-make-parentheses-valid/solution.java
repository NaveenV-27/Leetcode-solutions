class Solution {
    public int minAddToMakeValid(String str) {
        Stack<Character> s = new Stack<>();
        for(char ch : str.toCharArray()) {
            if(!s.isEmpty() && s.peek()=='(' && ch==')') {
                s.pop();
            } else {
                s.add(ch);
            }
        }
        return s.size();
    }
}
