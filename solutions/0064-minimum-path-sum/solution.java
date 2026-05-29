class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        int sum = 0;
        for(int i=0; i<m; i++) {
            sum += grid[i][0];
            dp[i][0] = sum;
        }
        sum = 0;
        for(int i=0; i<n; i++) {
            sum += grid[0][i];
            dp[0][i] = sum;
        }

        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
            }
        }
        return dp[m-1][n-1];
    }

    // public int minPathSum(int[][] grid, int sum, int i, int j, int[][] dp) {
    //     if(i < 0 || j < 0) return Integer.MAX_VALUE;
    //     if(i == 0 && j == 0) {
    //         return grid[0][0];
    //     }
    //     if(dp[i][j] != -1) return dp[i][j];
    //     int top = minPathSum(grid, sum, i-1, j, dp);
    //     int left = minPathSum(grid, sum, i, j-1, dp);
    //     return dp[i][j] = Math.min(top, left) + grid[i][j];
    // }

}
