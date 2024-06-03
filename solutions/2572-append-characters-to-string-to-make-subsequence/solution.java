class Solution {
    public int appendCharacters(String s, String t) {
        int sp = 0, tp = 0;
        int count = 0;
        while(sp < s.length() && tp < t.length()) {
            if(s.charAt(sp) == t.charAt(tp)) {
                count++;
                tp++;
            }
            sp++;
        }
        return t.length() - count;

    }
}
