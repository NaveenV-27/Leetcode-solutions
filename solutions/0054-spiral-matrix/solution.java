class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> l = new ArrayList<>();
        int rs = 0;
        int re = mat.length-1;
        int cs = 0;
        int ce = mat[0].length-1;
        while(rs <= re && cs <= ce) {
            for(int j=cs; j<=ce; j++) {
                l.add(mat[rs][j]);
            }
            for(int i=rs+1; i<=re; i++) {
                l.add(mat[i][ce]);
            }
            for(int j=ce-1; j>=cs; j--) {
                if(rs == re) {
                    return l;
                }
                l.add(mat[re][j]);
            }
            for(int i=re-1; i>=rs+1; i--) {
                if(cs == ce) {
                    return l;
                }
                l.add(mat[i][cs]);
            }
            rs++;
            cs++;
            re--;
            ce--;
        }
        return l;
    }
}
