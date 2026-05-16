class Solution {

    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];
        for(int i=1; i<=amount; i++) {
            dp[0][i] = -1;
        }

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=amount; j++) {
                if (coins[i-1] <= j) {
                    int used = dp[i][j-coins[i-1]] + 1;
                    if(used <= -1) used = Integer.MAX_VALUE;
                    int notUsed = dp[i-1][j];
                    if(notUsed <= -1) notUsed = Integer.MAX_VALUE;
                    dp[i][j] = Math.min(used, notUsed);
                } else {
                    if(dp[i-1][j] <= -1) dp[i][j] = Integer.MAX_VALUE;
                    else dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][amount] == Integer.MAX_VALUE ? -1 : dp[n][amount];

    }
}
