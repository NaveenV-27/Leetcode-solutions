class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        if(k < grid[0][0]) return 0;
        int count = 1;
        for(int i=1; i<n; i++) {
            grid[0][i] += grid[0][i-1]; 
            if(grid[0][i] <= k) {
                // System.out.println(grid[0][i]);
                count++;
            }
        }
        for(int i=1; i<m; i++) {
            int sum = 0;
            for(int j=0; j<n; j++) {
                sum += grid[i][j];
                grid[i][j] = sum + grid[i-1][j];
                if(grid[i][j] <= k) {
                    // System.out.println(grid[i][j]);
                    count++;
                }
            }
        }
        // for(int i=0; i<m; i++) {
        //     System.out.println(Arrays.toString(grid[i]));
        // }
        return count;
    }
}
