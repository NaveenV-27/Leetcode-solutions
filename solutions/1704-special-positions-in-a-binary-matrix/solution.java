class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int rows[] = new int[m];
        int cols[] = new int[n];
        int count = 0;

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(mat[i][j] == 1) {
                    rows[i]++;
                    cols[j]++;
                }
            }
        }

        // System.out.println(Arrays.toString(rows));
        // System.out.println(Arrays.toString(cols));

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(rows[i] == 1 && cols[j] == 1 && mat[i][j] == 1) {
                    count++;
                }
            }
        }
        return count;
        


    }
}
