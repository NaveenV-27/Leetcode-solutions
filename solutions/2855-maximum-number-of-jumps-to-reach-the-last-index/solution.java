class Solution {

    static {
        
    }

    public int maximumJumps(int[] nums, int target) {
        int n = nums.length;
        if(n == 2) {
            return Math.abs(nums[0] - nums[1]) <= target ? 1 : -1;
        }
        int[] dp = new int[n];
        for(int i=1; i<n; i++) {
            for(int j=0; j<i; j++) {
                if(Math.abs(nums[i] - nums[j]) <= target && !(j != 0 && dp[j] == 0)) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                } 
            }
        }
        // System.out.println(Arrays.toString(dp));
        return dp[n-1] == 0 ? -1 : dp[n-1];
    }
}
