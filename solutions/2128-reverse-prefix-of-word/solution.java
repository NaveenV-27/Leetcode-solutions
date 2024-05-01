class Solution {
    public String reversePrefix(String word, char ch) {
        int n=word.indexOf(ch);
        if(n == -1) {
            return word;
        }
        StringBuilder sb = new StringBuilder(word.substring(0,n+1));
        return sb.reverse().toString() + word.substring(n+1);
    }
}
