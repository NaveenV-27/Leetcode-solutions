class Solution {
    public int maxProduct(int n) {
        int m = 0, s = 0;
        while(n > 0) {
            int dig = n % 10;
            n /= 10;
            if(dig > m) {
                s = m;
                m = dig;
                // System.out.println(m);
            } else if(dig > s) {
                s = dig;
                // System.out.println(s);
            }
        }
        return m * s;
    }
}
