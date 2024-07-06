class Solution {
    public int passThePillow(int n, int t) {
        if((t/(n-1))% 2 == 0) {
            return t % (n-1) + 1;
        } else {
            return n - t % (n-1);
        }
    }
}
