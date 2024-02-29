class Solution {
    public int[][] generateMatrix(int n) {
        int m[][] = new int[n][n];
        int x = 1;
        int rs = 0, re = n-1;
        int cs = 0, ce = n-1;
        while(rs <= re && cs <= ce) {
            for(int j=cs; j<=ce; j++) {
                m[rs][j] = x;
                x++;
            }
            for(int i=rs+1; i<=re; i++) {
                if(cs==ce) {
                    return m;
                }
                m[i][ce] = x;
                x++;
            }
            for(int j=ce-1; j>=cs; j--) {
                if(rs == re) {
                    return m;
                }
                m[re][j] = x;
                x++;
            }
            for(int i=re-1; i>=rs+1; i--) {
                m[i][cs] = x;
                x++;
            }
            rs++;
            cs++;
            re--;
            ce--;
        }
        return m;
    }
}
