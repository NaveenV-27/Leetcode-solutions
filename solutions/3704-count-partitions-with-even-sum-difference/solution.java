class Solution {
    public int countPartitions(int[] nums) {
        int sum = 0;
        for(int i : nums) {
            sum += i;
        }
        int count = 0;
        int left = 0;
        int n = nums.length-1;
        for(int i=0; i<n; i++) {
            left += nums[i];
            sum -= nums[i];
            int diff = Math.abs(sum - left);
            if(diff % 2 == 0) count++;
        }
        return count;
    }
}
