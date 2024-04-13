class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0)
            return 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int heights[] = new int[cols];
        int maxArea = 0;
        for(char row[]: matrix) {
            for(int i=0; i<cols; i++) {
                heights[i] = (row[i] == '1') ? heights[i] + 1: 0;
            }
            for(int i=0; i<cols; i++) {
                for(int j=i, minHeight=Integer.MAX_VALUE; j<cols; j++) {
                    minHeight = Math.min(minHeight, heights[j]);
                    int area = minHeight * (j-i+1);
                    maxArea = Math.max(area, maxArea);
                }
            } 
        }
        return maxArea;
    }
}
