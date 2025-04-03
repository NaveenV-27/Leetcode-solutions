class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        int max = 0;
        long maxDiff = Integer.MIN_VALUE;
        long maxProd = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            maxProd = Math.max(maxProd, maxDiff * nums[i]);
            maxDiff = Math.max(maxDiff, max-nums[i]);
            max = Math.max(max, nums[i]);
        }
        return maxProd<0 ? 0: maxProd;
    }
}
