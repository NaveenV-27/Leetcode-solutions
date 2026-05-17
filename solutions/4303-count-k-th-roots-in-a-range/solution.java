class Solution {

    public int countKthRoots(long l, long r, int k) {

        long left = kthRootCeil(l, k);
        long right = kthRootFloor(r, k);

        return (int)Math.max(0, right - left + 1);
    }

    private long kthRootFloor(long n, int k) {

        long low = 0;
        long high = n;
        long ans = 0;

        while (low <= high) {

            long mid = low + (high - low) / 2;

            if (power(mid, k, n) <= n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    private long kthRootCeil(long n, int k) {

        long floor = kthRootFloor(n, k);

        if (power(floor, k, Long.MAX_VALUE) == n)
            return floor;

        return floor + 1;
    }

    private long power(long a, int k, long limit) {

        long result = 1;

        for (int i = 0; i < k; i++) {

            if (a != 0 && result > limit / a)
                return limit + 1;

            result *= a;
        }

        return result;
    }
}
