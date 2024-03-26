class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        for(int i:nums) {
            if(i > 0 && i <= n) {
                ans[i-1] = i;
            }
        }
        for(int i=0; i<n; i++) {
            if(ans[i] != i+1) {
                return i+1;
            }
        }
        return n+1; 
    }
}
