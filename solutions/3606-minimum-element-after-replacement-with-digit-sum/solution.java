class Solution {
    private int sumOfDigits(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i : nums) {
            min = Math.min(min, sumOfDigits(i));
        }
        return min;
    }
}
