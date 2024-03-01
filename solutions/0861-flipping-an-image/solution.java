class Solution {   
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i<image.length; i++) {
            for(int s=0, e=image.length-1; s<e; s++,e--) {
                int t=image[i][s];
                image[i][s] = image[i][e];
                image[i][e] = t;
            }
            for(int j=0; j<image.length; j++) {
                image[i][j] = image[i][j]^1;
            }
        }
        return image;
    }
}
