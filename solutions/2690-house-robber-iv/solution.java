class Solution {
    private boolean canRob(int nums[], int mid, int k) {
        int count = 0, n = nums.length;
        for(int i=0; i<n; i++) {
            if(nums[i] <= mid) {
                count++;
                i++;
            }
        }
        return count >= k;
    }
    public int minCapability(int[] nums, int k) {
        int l = 1;
        int r = Arrays.stream(nums).max().getAsInt();
        int ans = r;
        while(l <= r) {
            int mid = (l + r)/2;
            if(canRob(nums, mid, k)) {
                ans = mid;
                r = mid-1;
            } else {
                l = mid+1;
            }
        }
        return ans;

    }
}
