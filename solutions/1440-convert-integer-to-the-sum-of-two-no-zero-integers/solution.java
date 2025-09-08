class Solution {
    private boolean isNoZero(int n) {
        while(n > 0) {
            int dig = n%10;
            if(dig == 0) return false;
            n /= 10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        for(int i=0; i<=n/2; i++) {
            if(i > 0 && isNoZero(i) && isNoZero(n-i)) {
                return new int[]{i, n-i};
            }
        }
        return new int[]{-1, -1};
    }
}
