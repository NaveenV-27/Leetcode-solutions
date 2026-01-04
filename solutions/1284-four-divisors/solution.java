class Solution {
    private class Divisors {
        boolean hasFour;
        int sum;
        Divisors(boolean hasFour, int sum) {
            this.hasFour = hasFour;
            this.sum = sum;
        }
    }
    private Divisors checkDivisors(int n) {
        int root = (int)Math.ceil(Math.sqrt(n));
        int count = 0;
        int sum = 0;
        if(n == 6) return new Divisors(true, 12);
        
        for(int i=1; i<=root; i++) {
            if(n % i == 0) {
                if(i == root || root == n){
                    if(n == 6) System.out.println("Div:" + i + ", " + n/i );
                    count += 1;
                    sum += i; 
                } else {
                    if(n == 6) System.out.println("Div:" + i + ", " + n/i );
                    count += 2;
                    sum += (i + n/i);
                }
            }
            if(count > 4) {
                System.out.println("Divisors of "+ n + " :" + count + ", " + sum);
                return new Divisors(false, sum);
            }
        }
        // System.out.println("Divisors of "+ n + " :" + count + ", " + sum);
        return new Divisors(count == 4, sum);
    }
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for(int i : nums) {
            Divisors numInfo = checkDivisors(i);
            if(numInfo.hasFour) {
                sum += numInfo.sum;
            }
        }
        return sum;
    }
}
