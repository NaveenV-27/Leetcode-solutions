class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int i = 0, c = 0;
        while(c<s.length() ) {
            if(i<spaces.length && c == spaces[i]) {
                sb.append(' ');
                i++;
            } else {
                sb.append(s.charAt(c));
                c++;
            }
        }
        return sb.toString();
    }
}
