class Solution {
    private static int noOfSetBits(int n) {
        int c = 0;
        while(n > 0) {
            c += n&1;
            n >>= 1;
        }
        return c;
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for(int i=0; i<nums.size(); i++) {
            if(noOfSetBits(i) == k) {
                sum += nums.get(i);
            }
        }
        return sum;
    }
}
