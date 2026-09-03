class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int min = Integer.MAX_VALUE;
        int count = 0;
        for(int i : nums1) {
            if((i & 1 )== 0) {
                count++;
            }
            if(min > i) min = i;
        }
        return (min & 1) == 1 || count == n;
    }
}
