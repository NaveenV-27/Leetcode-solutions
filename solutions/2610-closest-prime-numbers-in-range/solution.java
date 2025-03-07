class Solution {
    private boolean isPrime(int n) {
        for(int i=2; i<=n/2; i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        int res[] = {-1, -1};
        
        boolean prime[] = new boolean[right + 1];
        for (int i = 0; i <= right; i++)
            prime[i] = true;

        for (int p = 2; p * p <= right; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= right; i += p)
                    prime[i] = false;
            }
        }
        int l = -1;
        int min = Integer.MAX_VALUE;
        for(int i=left; i<=right; i++) {
            if(prime[i] && i>1) {
                if(l!=-1) {
                    if(i-l < min) {
                        min = i-l;
                        res[0] = l;
                        res[1] = i;
                    }  
                }
                l = i;
            }
        }
        
        return res;
    }
}
