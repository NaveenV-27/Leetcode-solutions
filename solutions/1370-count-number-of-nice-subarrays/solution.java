class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length, count = 0;
        int cnt[] = new int[n+1];
        int t = 0;
        cnt[0] = 1;
        for(int i : nums) {
            t += i & 1;
            if(t - k >= 0) count += cnt[t-k];
            cnt[t]++;
        }
        return count;
    }
}
