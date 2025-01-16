class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        if(m%2 == 0 && n%2 == 0) return 0;
        int k = 0;
        int xor1 = 0;
        for(int i=0; i<m; i++) {
            xor1 ^= nums1[i];
        }
        int xor2 = 0;
        for(int i=0; i<n; i++) {
            xor2 ^= nums2[i];
        }
        if(m%2 == 0) {
            return xor1;
        }
        if(n%2 == 0) {
            return xor2;
        }
        
        return xor1^xor2;
    }
}
