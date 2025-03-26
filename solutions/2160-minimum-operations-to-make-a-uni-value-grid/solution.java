class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        int arr[] = new int[m*n];
        int rem = grid[0][0] % x;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                int num = grid[i][j];
                if(num % x != rem) {
                    return -1;
                }
                arr[i*n+j] = grid[i][j];
            }
        }
        Arrays.sort(arr);
        int med = arr[m*n/2]; 
        int res = 0;
        for(int i : arr) {
            res += Math.abs(med - i) / x;
        }

        return res;
    }
}
