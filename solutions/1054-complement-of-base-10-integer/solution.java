class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0) return 1;
        int mul = 1, res = 0;
        while(n > 0) {
            if((n & 1) == 0) {
                res += mul;
            }
            mul *= 2;
            n >>= 1;
        }
        return res;
    }
}
