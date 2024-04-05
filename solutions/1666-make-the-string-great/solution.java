class Solution {
    public String makeGood(String s) {
        int n = s.length();
        Stack<Character> p = new Stack<>();
        for(int i=0; i<n; i++) {
            if(!p.isEmpty() && Math.abs(s.charAt(i) - p.peek()) == 32) {
                p.pop();
            } else {
                p.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!p.isEmpty()) {
            sb.append(p.pop());
        }
        return sb.reverse().toString();

    }
}
