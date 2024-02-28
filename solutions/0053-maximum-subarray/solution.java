class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int cs = 0, ms = 0;
        for(int i=0; i<n; i++) {
            cs += nums[i];
            if(cs < 0) cs = 0;
            ms = Math.max(cs, ms);
        }
        Arrays.sort(nums);
        if(nums[n-1] < 0) ms = nums[n-1];
        return ms;
    }
}
