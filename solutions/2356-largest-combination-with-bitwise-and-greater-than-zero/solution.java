class Solution {
    public int largestCombination(int[] candidates) {
        int max = 0;
        for(int i=0; i<24; i++) {
            int num = 0;
            for(int n : candidates) {
                if((n & (1 << i)) != 0) num++;
            }
            max = Math.max(num, max);
        }
        return max;
    }
}
