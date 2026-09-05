class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] minSuff = new int[n];
        minSuff[n-1] = nums[n-1];
        for(int i=n-2; i>=0; i--) {
            // System.out.println(i+ ": " + nums[i]);
            minSuff[i] = Math.min(nums[i], minSuff[i+1]);
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            max = Math.max(max, nums[i]);
            // System.out.println(max + ", " + minSuff[i]);
            if(max - minSuff[i] <= k) {
                return i;
            }
        }
        return -1;
    }
}
