class Solution {
    public int findClosest(int x, int y, int z) {
        int d1 = Math.abs(x - z);
        int d2 = Math.abs(y - z);
        // System.out.println("Distances: " + d1 + ", " + d2);
        if(d1 == d2) return 0;
        return d1 < d2 ? 1 : 2;
    }
}
