class Solution {
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        int[] zeroes = new int[n];
        for(int i=0; i<n; i++) {
            int count = 0;
            for(int j=grid[i].length - 1; j>=0; j--) {
                if(grid[i][j] != 0) {
                    break;
                }
                count++;
            }
            zeroes[i] = count;
        }

        int count = 0;
        for(int i=0; i<n; i++) {
            int r = n - i - 1;
            int j = i;
            while(j < n && zeroes[j] < r) j++;

            if(j == n) return -1;
            while(j > i) {
                int t = zeroes[j];
                zeroes[j] = zeroes[j-1];
                zeroes[j - 1] = t;
                j--;
                count++;
            } 
        }
        return count;


    }
}
