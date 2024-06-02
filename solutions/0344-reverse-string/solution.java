class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int f = 0, l = n - 1;
        while(f < l) {
            char ch = s[f];
            s[f++] = s[l];
            s[l--] = ch;
        }
    }
}
