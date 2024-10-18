class Solution {
    static void backtrack(int nums[], int idx, int curr, int max, int or[]) {
        if(curr == max) or[0]++;
        for(int i=idx; i<nums.length; i++) {
            backtrack(nums, i+1, curr|nums[i], max, or);
        }
    }
    public int countMaxOrSubsets(int[] nums) {
        int n = nums.length;
        int maxOr = 0;
        for(int i : nums) {
            maxOr |= i;
        }
        int or[] = new int[1];
        backtrack(nums, 0, 0, maxOr, or);
        return or[0];

    }
}
