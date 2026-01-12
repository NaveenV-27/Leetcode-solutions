class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int res = 0;
        int n = points.length;
        for (int i = 1; i < n; i++) {
            int x = Math.abs(points[i][0] - points[i-1][0]);
            int y = Math.abs(points[i][1] - points[i-1][1]);
            res += Math.min(x, y) + Math.abs(x-y);
        }
        return res;
    }
}
