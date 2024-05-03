class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        while(nums[j] > 0 && j>0) {
            if(nums[i] == 0 - nums[j]) return nums[j];
            else i++;
            if(nums[i]>0){
                j--; 
                i = 0; 
            }
        }
        return -1;
    }
}
