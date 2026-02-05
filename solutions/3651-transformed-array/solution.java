class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > 0) {
                res[i] = nums[(i + nums[i]) % n];
                // System.out.println((i + nums[i]) % n);
            } else if(nums[i] < 0) {
                res[i] = nums[-nums[i] > i ? (n + (nums[i] + i) % n) % n : nums[i] + i];   
                // System.out.println(n + (nums[i] + i) % n);
            } else {
                res[i] = nums[i];
            }
        } 
        return res;
    }
}
