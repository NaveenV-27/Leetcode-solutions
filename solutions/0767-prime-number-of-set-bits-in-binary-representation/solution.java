class Solution {
    private boolean isBitPrime(int n) {
        int bits = Integer.bitCount(n);
        if(bits < 2) return false;
        for(int i=2; bits>2 && i<=Math.sqrt(bits); i++) {
            if(bits != i && bits % i == 0) {
                return false;
            }
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i=left; i<=right; i++) {
            if(isBitPrime(i)) {
                count++;
            }
        }
        return count;
    }
}
