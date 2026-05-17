class Solution {
    private int num(char ch) {
        return (int) ch - 48;
    }
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int n = s.length();
        for(int i=1; i<n; i++) {
            if(Math.abs(num(s.charAt(i)) - num(s.charAt(i-1))) > 2) {
                return false;
            }
        }
        return true;
    }
}
