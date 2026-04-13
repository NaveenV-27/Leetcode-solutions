class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=0; i<nums.length; i++) {
            if(i <= start) {
                if(nums[start - i] == target) {
                    min = Math.min(i, min); 
                }
            }
            if((start + i) < n) {
                if(nums[start + i] == target) {
                    min = Math.min(i, min); 
                }

            }
        }
        return min;

    }
}
