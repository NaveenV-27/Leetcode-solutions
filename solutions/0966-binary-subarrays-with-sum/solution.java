class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return solve(nums, goal) - solve(nums, goal-1);
    }
    static int solve(int nums[], int goal) {
        int i, j = 0, sum = 0, res = 0;
        for(i=0; i<nums.length; i++) {
            sum += nums[i];
            while(sum > goal && j <= i) {
                sum -= nums[j];
                j++;
            } 
            if(sum <= goal) {
                res += i - j + 1;
            }
        }
        return res;
    }
}
