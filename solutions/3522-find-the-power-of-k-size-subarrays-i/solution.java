class Solution {
    private int power(int[] nums, int s, int e) {
        for(int i=s; i<e; i++) {
            if(!(nums[i+1]>nums[i]) || ((nums[i]+1)!=nums[i+1])) {
                return -1;
            }
        }
        return nums[e];
    }
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int res[] = new int[n-k+1];
        for(int i=0; i<=n-k; i++) {
            res[i] = power(nums, i, i+k-1);
        }
        return res;
    }
}
