class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;

        if(n <= 2) return n;
        int msb = Integer.highestOneBit(n);
        return msb*2;
    }
}
