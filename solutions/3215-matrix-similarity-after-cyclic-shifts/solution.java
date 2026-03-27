class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        k = k%n;
        for(int i=0; i<m; i++) {
            if(i % 2 == 0) {
                for(int j=0; j<n; j++) {
                    if(mat[i][j] != mat[i][(j+k)%n]) {
                        return false;
                    }
                }
            } else {
                for(int j=n-1; j>=0; j--) {
                    if(mat[i][j] != mat[i][(j-k+n) % n]) {
                        return false;
                    }
                }

            }
        }
        return true;
    }
}
