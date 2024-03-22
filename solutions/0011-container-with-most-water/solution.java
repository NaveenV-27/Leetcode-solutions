class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int lp = 0;
        int rp = height.length-1;
        while(lp < rp) {
            int ht = Math.min(height[rp], height[lp]);
            int wt = rp - lp;
            max = Math.max(max, ht*wt);
            if(height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        return max;
    }
}
