class Solution {
    private long summation(long n) {
        return n * (n+1) / 2 - n;
    }
    public long getDescentPeriods(int[] prices) {
        int n = prices.length;
        long res = 1;
        long count = 1;
        for(int i=1; i<n; i++) {
            if(prices[i] == prices[i-1] - 1) {
                count++;
            } else {
                count = 1;
            }
            res += count;
        }
        return res;
    }
}
