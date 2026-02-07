class Solution {
    public int minimumDeletions(String s) {
        int res = 0, b = 0;
        for(char ch : s.toCharArray()) {
            if(ch == 'b') {
                b++;
            } else if(b>0) {
                res++;
                b--;
            }
        }
        return res;
    }
}
