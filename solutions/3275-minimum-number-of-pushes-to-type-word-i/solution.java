class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        if(n <= 8) return n;
        return n > 16 ? n > 24 ? 8 + 16 + 24 + (n-24)*4 : 8 + 16 + (n-16)*3 : 8 + (n - 8) * 2;
    }
}
