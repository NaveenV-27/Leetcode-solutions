class Solution {
    private boolean isStrictlyIncreasing(List<Integer> nums, int s, int e) {
        for(int i=s; i<e; i++) {
            System.out.println("idx: " + i + ", " + (i+1));
            if(nums.get(i) >= nums.get(i+1)) {
                return false;
            }
        }
        return true;   
    }
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        if(k == 1) {
            return true;
        }
        for(int i = 0, j = i+k; j+k<=n; i++, j++) {
            if(isStrictlyIncreasing(nums, i, i+k-1) && isStrictlyIncreasing(nums, j, j+k-1)) {
                return true;
            }
        } 
        return false;
    }
}
