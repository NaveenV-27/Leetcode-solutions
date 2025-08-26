class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int area = 0;
        long max = 0;
        for(int[] dim : dimensions) {
            long diag = (dim[0] * dim[0]) + (dim[1] * dim[1]);
            System.out.println("Diagonal " + diag);
            if(diag == max) {
                area = Math.max(area, dim[0]*dim[1]);
            } else if(diag > max) {
                max = diag;
                area = dim[0] * dim[1];
            }
            System.out.println("Area " + area);

        }
        return area;
    }
}
