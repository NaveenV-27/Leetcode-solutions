class Solution {
    public int climbStairs(int n) {
        if(n<=3) {
            return n;
        }
        int n1 = 1, n2 = 2, s = 0;
        while(n>=3) {
            s=n1+n2;
            n1=n2;
            n2=s;
            n--;
        }
        return s;
    }
}
