class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        int z1 = 0;
        int z2 = 0;
        long sum1 = 0;
        long sum2 = 0;
        for(int i : nums1) {
            if(i == 0) z1++;
            sum1 += i;
        }
        for(int i : nums2) {
            if(i == 0) z2++;
            sum2 += i;
        }
        if(sum1 <= sum2) {
            if(sum1 == sum2) {
                if(z1 == z2) return sum1+z1;
            }
            if(z1 == 0) return -1;
            if(z2 == 0 && sum1+z1 > sum2) return -1;
        } else if(sum2 < sum1) {
            if(z2 == 0) return -1;
            if(z1 == 0 && sum2+z2 > sum1) return -1;
        }
        return sum1+z1>=sum2+z2? sum1+z1 : sum2+z2;
    }
}
