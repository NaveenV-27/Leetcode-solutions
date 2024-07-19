class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> l = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        for(int i=0; i<matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            for(int j=0; j<matrix[0].length; j++) {
                min = Math.min(matrix[i][j], min);
            }
            row.add(min);
        }
        for(int j=0; j<matrix[0].length; j++) {
            int max = 0;
            for(int i=0; i<matrix.length; i++) {
                max = Math.max(matrix[i][j], max);
            }
            if(row.contains(max)) l.add(max);
        }
        return l;
    }
}
