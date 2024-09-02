class Solution {
    public int[][] construct2DArray(int[] og, int m, int n) {
        if(og.length != m*n) return new int[0][0];
        int mat[][] = new int[m][n];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                mat[i][j] = og[i*n + j];
            }
        }
        return mat;
    }
}
