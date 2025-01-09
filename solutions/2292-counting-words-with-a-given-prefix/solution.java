class Solution {
    private boolean isPrefix(String str1, String str2) {
        int n = str1.length();
        if(str2.length() < n) return false;
        for(int i=0; i<n; i++) {
            if(str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(String word : words) {
            if(isPrefix(pref, word)) {
                count++;
            }
        }
        return count;
    }
}
