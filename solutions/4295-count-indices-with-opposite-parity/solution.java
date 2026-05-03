class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int[] scores = new int[n];
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                if((nums[i] & 1) != (nums[j] & 1)) {
                    scores[i]++;
                }
            }
        }
        return scores;
    }
}
