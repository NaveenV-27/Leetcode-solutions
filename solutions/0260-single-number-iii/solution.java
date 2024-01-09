class Solution {
    int sol[] = new int[2];
    void addSol(int si, int[] nums, int i) {
        if(si >= nums.length-1) {
            if(sol[1] == 0) {
                sol[1] = nums[nums.length-1];
            }
            return;
        }
        if(nums[si] == nums[si+1]) {
            addSol(si+2, nums, i);
        } else {
            sol[i] = nums[si];
            if(i == 1) {
                return;
            }
            addSol(si+1, nums, 1);
        }
    }
    public int[] singleNumber(int[] nums) {
        if(nums.length <= 2) {
            return nums;
        }
        Arrays.sort(nums);
        addSol(0, nums, 0);
        return sol;
    }
}
