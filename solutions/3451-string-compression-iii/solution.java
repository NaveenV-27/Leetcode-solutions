class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        char ch = word.charAt(0);
        int cnt = 1;
        for(int i=1; i<word.length(); i++) { 
            if(word.charAt(i) == ch && cnt<9) {
                cnt++;
            } else {
                sb.append(cnt).append(ch);
                cnt = 1;
                ch = word.charAt(i);
            }
        }
        sb.append(cnt).append(ch);
        return sb.toString();
    }
}
