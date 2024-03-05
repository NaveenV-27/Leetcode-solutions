class Solution {
    static int fibo(int n, int a, int b) {
        if(n == 1) {
            return b;
        }
        return fibo(n-1, b, a + b);
    }
    public int fib(int n) {
        if(n > 0) {
            return fibo(n, 0, 1);
        }
        return 0;
    }
}
