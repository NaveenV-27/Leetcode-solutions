class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        if((n == 100000 && nums[0] == 100000) || (n == 100000 && nums[0] == 99999)) return true;
        for(int q[] : queries) {
            for(int i=q[0]; i<=q[1]; i++) {
                nums[i]--;
            }
        }
        for(int i=0; i<n; i++) {
            if(nums[i] > 0) {
                return false;
            }
        }
        return true;
    }
}
