class Solution {
    private boolean isPrefixAndSuffix(String str1, String str2) {
        int n = str1.length()-1;
        if(str2.length() <= n) return false;
        if(str1.equals(str2)) return true;
        for(int i=0, j=str2.length()-1; i<str1.length(); i++, j--) {
            if((str1.charAt(i) != str2.charAt(i)) || (str1.charAt(n--) != str2.charAt(j))) {
                return false;
            }
        }
        return true;
    }
    public int countPrefixSuffixPairs(String[] words) {
        int n = words.length;
        int count = 0;
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                if(isPrefixAndSuffix(words[i], words[j])) count++;
            }
        }
        return count;
    }
}
