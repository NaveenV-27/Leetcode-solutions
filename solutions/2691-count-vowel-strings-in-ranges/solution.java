class Solution {
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    private boolean isVowelString(String s) {
        return isVowel(s.charAt(0)) && isVowel(s.charAt(s.length()-1));
        
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] isGood = new int[n];
        for(int i=0; i<n; i++) {
            if(isVowelString(words[i])) {
                isGood[i] = 1;
            }
        }
        int ans[] = new int[queries.length];
        for(int j=0; j<ans.length; j++) {
            int arr[] = queries[j];
            int res = 0;
            for(int i=arr[0]; i<=arr[1]; i++) {
                res += isGood[i];
            }   
            ans[j] = res;
        }
        return ans;
    }
}
