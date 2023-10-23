class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 1) {
            return true;
        }
        if(n <= 0) {
            return false;
        }
        double s = Math.sqrt(n);
        double log2s = Math.log(s) / Math.log(2);
        return (log2s == (int)log2s);

    }
}
