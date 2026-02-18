class Solution {
    public boolean hasAlternatingBits(int n) {
        int b = n & 1;
        while(n >= 1) {
            n >>= 1;
            if(b == (n & 1)) {
                return false;
            }
            b = n & 1;
        }
        return true;
    }
}
