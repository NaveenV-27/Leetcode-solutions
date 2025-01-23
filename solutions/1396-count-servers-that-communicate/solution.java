class Solution {
    public int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                boolean found = false;
                if(grid[i][j] == 1) {
                    for(int k=0; k<m; k++) {
                        if(k != i && grid[k][j] == 1) {
                            count++;
                            found = true;
                            break;
                        }
                    }
                    for(int k=0; k<n; k++) {
                        if(k != j && !found && grid[i][k] == 1 ) {
                            count++;
                            break;
                        }
                    }
                }
            }
        }
        return count;
    }
}
