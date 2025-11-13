class Solution {
    public int maxOperations(String s) {
        int n = s.length();
        int ops = 0;
        int count = 0;
        for(int i=0; i<n-1; i++) {
            char ch = s.charAt(i);
            char next = s.charAt(i+1);
            if(ch == '1') {
                count++;
                if(next == '0') {
                    ops += count;
                }
            }
        }
        return ops;
    }
}
