class Solution {
    public int waysToSplitArray(int[] nums) {
        long prefix = 0;
        for(int i : nums) {
            prefix += i;
        }
        int cnt = 0;
        long sum = 0;
        for(int i=0; i<nums.length-1; i++) {
            sum += nums[i];
            prefix -= nums[i];
            if(sum >= prefix) {
                cnt++;
            }

        }
        System.gc();
        return cnt;
    }
}
