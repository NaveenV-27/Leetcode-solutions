class Solution {
    private int reverseNum(int n) {
        int num = n;
        int rev = 0;
        while(num > 0) {
            int dig = num % 10;
            rev = rev*10 + dig;
            num /= 10;
        }
        return rev;
    }

    private boolean isPrime(int n) {
        if(n == 0 || n == 1) return false;
        // int sqrt = (int)Math.sqrt(n);
        for(int i=2; i<=n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public int sumOfPrimesInRange(int n) {
        if(n < 10) return isPrime(n) ? n : 0;
        int rev = reverseNum(n);
        int l = Math.min(n, rev);
        int u = Math.max(n, rev);
        int sum = 0;
        for(int i=l; i<=u; i++) {
            if(isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
