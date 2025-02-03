class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        // int n = nums.length;
        int inc = 1;
        int dec = 1;
        int max = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] > nums[i-1]) {
                dec = 1;
                inc++;
            } else if(nums[i] < nums[i-1]) {
                inc = 1;
                dec++;
            } else {
                inc = 1;
                dec = 1;
            }
            max = Math.max(max, Math.max(inc, dec));
        }
        return max;
    }
}
