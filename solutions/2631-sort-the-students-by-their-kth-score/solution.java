class Solution {
    static void swap(int a[][], int i, int j) {
        int t[] = new int[a.length];
        t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public int[][] sortTheStudents(int[][] score, int k) {
        int m = score.length;
        for(int i=0; i<m; i++) {
            for(int j=0; j<m-i-1; j++) {
                if(score[j][k] < score[j+1][k]) {
                    swap(score, j, j+1);
                }   
            }
        }
        return score;
    }
}
