class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int n = grid[0].length;
        for(int i=0; i<grid.length; i++) {
            for(int j=n-1; j>=0 && grid[i][j] < 0; j--) {
                count++;
            }
        }
        return count;
    }
}
