class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long res = 0;
        long zeroes = 0;
        for(int i : nums) {
            if(i == 0) {
                zeroes++;
            } else if(zeroes >= 1) {
                res += (zeroes * (zeroes + 1)) / 2;
                System.out.println("Zeroes in loop : " + zeroes + " " + res);
                zeroes = 0;
            }
        }
        if(zeroes >= 1) {
            res += (zeroes * (zeroes + 1)) / 2;
            System.out.println("Zeroes : " + zeroes + " " + res);
        }
        return res;
    }
}
