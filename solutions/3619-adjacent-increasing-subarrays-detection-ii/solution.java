class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        int curr = 1, prev = 0, res = 0;
        for(int i=1; i<n; i++) {
            if(nums.get(i) > nums.get(i-1)) {
                curr++;
            } else {
                prev = curr;
                curr = 1;
            }
            int half = curr / 2;
            int min = Math.min(curr, prev);
            int can = Math.max(half, min);
            if(can > res) res = can;
        }
        return res;
    }
}
