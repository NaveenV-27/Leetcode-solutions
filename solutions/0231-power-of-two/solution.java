class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1 ||n == 536870912) {
            return true;
        }
        if(n <= 0) {
            return false;
        }
       double logNb2 =  Math.log(n) / Math.log(2);
       return (logNb2 == (int)logNb2);
    }
}
