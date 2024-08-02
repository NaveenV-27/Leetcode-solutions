class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int cnt=0;
        for(int i=0; i<n; i++) {
            if(nums[i] == 1) cnt++;
        }
        int k = 0;
        for(int i=0; i<cnt; i++) {
            k += nums[i];
        }
        int max = k;
        for(int i=cnt; i<n+cnt; i++) {
            k += nums[i%n] - nums[(i-cnt)%n];
            max = Math.max(max,k);
        }
        return cnt - max;
    }
}
