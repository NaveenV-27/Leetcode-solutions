class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int max = 0;
        for(int i: nums) {
            max = Math.max(i, max);
        }
        int count = 0, left = 0, right = 0;
        long subs = 0;
        while(right < n || left > right) {
            if(nums[right] == max) {
                count++;
            }
            while(count >= k) {
                if(nums[left] == max) {
                    count--;
                }
                left++;
                subs += n - right;
            }
            right++;
        }
        return subs;

    }
}
