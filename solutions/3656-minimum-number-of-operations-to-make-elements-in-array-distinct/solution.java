class Solution {
    private boolean isDistinct(int[] nums, int k) {
        int map[] = new int[101];
        for(int i=k; i<nums.length; i++) {
            if(map[nums[i]] > 0) return false;
            map[nums[i]]++;
        }
        return true;
    }
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int count = 0;
        if(isDistinct(nums, 0)) {
            return 0;
        }
        for(int i=0; i<n; i+=3) {
            if(isDistinct(nums, i)) {
                return count;
            }
            count++;
        }
        return count;
    }
}
