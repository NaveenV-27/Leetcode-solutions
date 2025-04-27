class Solution {
    public int countSubarrays(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i=0; i+2<n; i++) {
            int sum = nums[i] + nums[i+2];
            if(nums[i+1] == sum*2) {
                count++;
            }
        }
        return count;
    }
}
