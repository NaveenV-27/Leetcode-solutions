class Solution {
    public int maxAscendingSum(int[] nums) {
        if(nums.length == 1) return nums[0];
        int n = nums.length;
        int sum = 0;
        int max = 0;
        for(int i=0; i<n-1; i++) {
            sum += nums[i];
            if((nums[i] >= nums[i+1])) {  
                if(sum > 0) {
                    max = Math.max(max, sum);
                    sum = 0;
                } 
            } 
            else {
                if(i+1 == n-1) {
                    sum += nums[i+1];
                }
            }
            
        }
        max = Math.max(sum, max);
        return max;
    }
}
