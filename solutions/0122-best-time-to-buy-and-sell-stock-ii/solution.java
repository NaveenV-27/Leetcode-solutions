class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[2][prices.length];
        Arrays.fill(dp[0], -1);
        Arrays.fill(dp[1], -1);
        return f(prices, 0, 1, dp);
    }
    
    public int f(int[] prices, int i, int buy, int[][] dp) {
        if(i == prices.length) {
            return 0;
        }
        if(dp[buy][i] != -1) return dp[buy][i];
        int profit = 0;
        if(buy == 1) {
            profit = Math.max(-prices[i] + f(prices, i+1, 0, dp), f(prices, i+1, 1, dp));
        } else {

            profit = Math.max(prices[i] + f(prices, i+1, 1, dp), f(prices, i+1, 0, dp));
        }
        return dp[buy][i] = profit;
    }
}
