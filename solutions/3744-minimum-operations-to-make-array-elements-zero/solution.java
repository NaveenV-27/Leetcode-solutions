class Solution {
    public long minOperations(int[][] queries) {
        long ans = 0;
        for (int[] query : queries) {
            int l = query[0], r = query[1];
            ans += (getOperations(r) - getOperations(l - 1) + 1) / 2;
        }
        return ans;
    }

    // Computes the total operation weight for [1..n]
    private long getOperations(int n) {
        long res = 0;
        int ops = 0;
        for (long powerOfFour = 1; powerOfFour <= n; powerOfFour *= 4) {
            int start = (int) powerOfFour;
            int end = (int) Math.min(n, powerOfFour * 4 - 1);
            ops++;
            res += (long) (end - start + 1) * ops;
        }
        return res;
    }
}

