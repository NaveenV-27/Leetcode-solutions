class Solution {
    private boolean isSubString(String[] words, String str) {
        for(String word : words) {
            if(word.contains(str) && !word.equals(str)) return true;
        }
        return false;
    }
    public List<String> stringMatching(String[] words) {
        List<String> l = new ArrayList<>();
        int n = words.length;
        for(int i=0; i<n; i++) {
            if(isSubString(words, words[i])) {
                l.add(words[i]);
            }
        }
        return l;
    }
}
