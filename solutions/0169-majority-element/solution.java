class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 1;
        int k = 0;
        int num = nums[k];
        while(k < n) {
            num = nums[k];
            for(int i=k+1; i<n; i++) {
                if(nums[i] == num) {
                    count++;
                } else {
                    count--;
                }
            }
            if(count > 0) break;
            else {
                k++;
                count = 1;
            }
        }
        return num;
        
    }
}
