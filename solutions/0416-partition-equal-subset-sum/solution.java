import java.util.*;

class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i : nums) sum += i;
        if(sum % 2 != 0) return false;
        int t = (sum/2);
        boolean[][] dp = new boolean[n+1][t+1];
        for(int i=0; i<=n; i++) {
            dp[i][0] = true;
        }

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=t; j++) {
                int v = nums[i-1];
                if(v <= j && dp[i-1][j-v]) {
                    dp[i][j] = true;
                }
                if(dp[i-1][j]) {
                    dp[i][j] = true;
                }
            }
        }
        return dp[n][t];
    }
}
