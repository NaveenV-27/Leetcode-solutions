class Solution {
    public int[] getMaximumXor(int[] nums, int mb) {
        int max = (int)Math.pow(2,mb) - 1;
        int n = nums.length, xor = 0;
        int res[] = new int[n];
        for(int i=0; i<n; i++) {
            xor ^= nums[i];
        }
        for(int i=0; i<n; i++) {
            res[i] = max ^ xor;
            xor ^= nums[n-i-1];
        }
        return res;
    }
}
