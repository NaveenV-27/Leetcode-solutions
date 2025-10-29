class Solution {
    public int smallestNumber(int n) {
        int sol = ~0;
        while(n > 0) {
            n >>= 1;
            sol <<= 1;
        }
        return ~sol;
    }
}
