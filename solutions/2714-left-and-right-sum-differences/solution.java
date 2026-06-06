class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int leftSum = 0;
        int rightSum = 0;
        for(int i=0; i<n; i++) {
            left[i] = leftSum;
            right[n - i - 1] = rightSum;
            leftSum += nums[i];
            rightSum += nums[n-i-1];
        }
        int[] res = new int[n];
        for(int i=0; i<n; i++) {
            res[i] = Math.abs(left[i] - right[i]); 
        }
        return res;
    }
}
