class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        // if(n == 1) return nums[0] + 1;
        int count = 1;
        int sum = nums[0];
        Set<Integer> set = new HashSet<>();
        set.add(nums[0]);
        boolean isPrefix = true;
        for(int i=1; i<n; i++) {
            set.add(nums[i]);
            if(isPrefix && nums[i] == nums[i-1] + 1) {
                count++;
                sum += nums[i];
            } else {
                isPrefix = false;
            }
        }
        
        for(int i=sum; i <= 51; i++) {
            if(!set.contains(i)) {
                return i;
            }
        }
        return sum;
    }
}
