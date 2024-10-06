class Solution {
    public boolean areSentencesSimilar(String s1, String s2) {
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");

        if(words1.length<words2.length) {
            String[] temp = words1;
            words1 = words2;
            words2 = temp;
        }
        int s = 0, e = 0, n1 = words1.length, n2 = words2.length;
        while(s < n2 && words1[s].equals(words2[s])) {
            s++;
        }
        while(e < n2 && words1[n1-e-1].equals(words2[n2-e-1])) {
            e++;
        }

        return s+e>=n2;
    }
}
