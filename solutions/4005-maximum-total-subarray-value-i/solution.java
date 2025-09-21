class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max = 0;
        long min = Integer.MAX_VALUE;
        for(int i : nums) {
            max = Math.max(i, max);
            min = Math.min(i, min);
        }
        long optimal = (max - min) * k;
        return optimal;
    }
}
