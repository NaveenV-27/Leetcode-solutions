class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int n[] = new int[2];
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums.length && j != i; j++) {
                if(nums[i] + nums[j] == target) {
                    n[0] = j;
                    n[1] = i; 
                }                
            }
        }
        return n;
    }
}
