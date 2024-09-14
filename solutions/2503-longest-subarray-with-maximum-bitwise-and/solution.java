class Solution {
    public int longestSubarray(int[] nums) {
        int largest = 0;
        for(int i:nums) {
            largest = Math.max(largest, i);
        }
        int cnt = 0;
        int max = 0;
        for(int i:nums) {
            if(i == largest) cnt++;
            max = Math.max(max, cnt);
            if(i != largest && cnt > 0) {
                cnt = 0;
            } 
        }
        return max;
    }
}
