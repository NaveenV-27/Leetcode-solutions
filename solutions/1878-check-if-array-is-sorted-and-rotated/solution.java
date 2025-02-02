class Solution {
    private boolean isSorted(int[] nums, int s, int p) {
        if(s == nums.length-1) return nums[s] <= nums[0];
        for(int i=s; i<nums.length-1; i++) {
            if(nums[i] > nums[i+1] || nums[i] > nums[0] || nums[i+1] > nums[0]) return false;
        }
        return true;
    }
    public boolean check(int[] nums) {
        int n = nums.length;
        for(int i=1; i<n; i++) {
            if(nums[i-1] > nums[i]) {
                return isSorted(nums, i, n);
            }
        }
        return true;
    }
}
