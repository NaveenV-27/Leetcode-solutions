class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n < 3) {
            return 0;
        }
        int lh[] = new int[n];
        int rh[] = new int[n];
        for(int i=0,j=n-1; i<n; i++,j--) {
            if(i == 0) {
                lh[i] = height[i];
                rh[j] = height[j];
            } else {
                lh[i] = Math.max(lh[i-1], height[i]);
                rh[j] = Math.max(rh[j+1], height[j]);
            }
        }
        int water = 0;
        for(int i=0; i<n; i++) {
            int ht = Math.min(lh[i], rh[i]);
            if((ht - height[i]) > 0) {
                water += (ht - height[i]);
            }
        }
        return water;
    }
}
