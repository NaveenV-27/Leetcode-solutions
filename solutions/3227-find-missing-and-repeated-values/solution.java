class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int map[] = new int[n*n+1];
        int res[] = new int[2];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                int val = grid[i][j];
                if(map[val] == 1) {
                    res[0] = val; 
                } else {
                    map[val]++;
                }
            }
        }

        for(int i=1; i<=n*n; i++) {
            if(map[i] == 0) {
                res[1] = i;
            } 
        }
        return res;
    }
}
