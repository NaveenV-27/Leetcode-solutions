class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        if(n == 1) return matrix[0][0]; 
        int min = Integer.MAX_VALUE;
        int[][] dp = new int[n][n];
        for(int i=0; i<n; i++) {
            dp[0][i] = matrix[0][i];
        }
        for(int i=1; i<n; i++) {
            for(int j=0; j<n; j++) {
                int top = dp[i-1][j];
                int left = j-1 >= 0 ? dp[i-1][j-1] : Integer.MAX_VALUE;
                int right = j < n-1 ? dp[i-1][j+1] : Integer.MAX_VALUE;
                dp[i][j] = Math.min(top, Math.min(left, right)) + matrix[i][j];
                if(i == n-1 && dp[i][j] < min) {
                    min = dp[i][j];
                }
            }
        }

        return min;
        
    }
    // private int minFallingPathSum(int[][] matrix, int i, int j, int[][] dp) {
    //     if(j < 0 || j >= matrix.length) return Integer.MAX_VALUE;
    //     if(i == 0) return matrix[0][j];

    //     if(dp[i][j] != -1) return dp[i][j];

    //     int top = minFallingPathSum(matrix, i-1, j, dp); 
    //     int left = minFallingPathSum(matrix, i-1, j-1, dp); 
    //     int right = minFallingPathSum(matrix, i-1, j+1, dp); 
    //     return dp[i][j] = Math.min(top, Math.min(left, right)) + matrix[i][j];
    // }
}
