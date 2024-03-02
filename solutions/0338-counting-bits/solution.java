class Solution {
    static int noOfSetBits(int n) {
        int c = 0;
        while(n > 0) {
            if((n & 1) == 1) {
                c++;
            }
            n = n>>1;
        }
        return c;
    }
    public int[] countBits(int n) {
        int a[] = new int[n+1];
        for(int i=0; i<=n; i++) {
            a[i] = noOfSetBits(i);
        }
        return a;
    }
}
