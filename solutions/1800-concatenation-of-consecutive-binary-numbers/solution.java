class Solution {
    public int concatenatedBinary(int n) {
        int mod = 1_000_000_007;
        long res = 0;
        int bits = 1;
        int val = 1;
        for(int i=1; i<=n; i++) {
            if(val * 2 == i) {
                bits++;
                val = i;
            }
            res = ((res << bits) | i) % mod;
        }
        return (int)res;
    }
}
