class Solution {
    public int xorOperation(int n, int s) {
        int res = 0;
        for(int i=0; i<n; i++) {
           res ^= (s + 2 * i);
        }
        return res;
    }
}
