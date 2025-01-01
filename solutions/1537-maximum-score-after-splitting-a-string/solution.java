class Solution {
    public int maxScore(String s) {
        int ones = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '1') {
                ones++;
            }
        }
        if(ones == 0) {
            return s.length()-1;
        }
        int max = 0;
        int zeros = 0;
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '0') {
                zeros += 1;
            } else {
                ones -= 1;
            }
            if(i == s.length()-1 && ones == 0) break;
            max = Math.max(max, ones+zeros);
        }
        return max;
    }
}
