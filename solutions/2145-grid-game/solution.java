class Solution {
    public long gridGame(int[][] grid) {
        long min = Long.MAX_VALUE;
        long r1 = 0;
        for(int i=0; i<grid[0].length; i++) {
            r1 += grid[0][i];
        }
        long r2 = 0;
        for(int i=0; i<grid[0].length; i++) {
            r1 -= grid[0][i];
            min = Math.min(min, Math.max(r1, r2));
            r2 += grid[1][i];
        }
        return min;
    }
}
