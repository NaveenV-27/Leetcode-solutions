class Solution {
    public boolean isTrionic(int[] nums) {
        if(nums[0] > nums[1]) {
            return false;
        }
        // boolean trionic = false;
        int n = nums.length;
        int i = 0;
        while(nums[i] < nums[i+1]) {
            if(i==n-2) {
                // System.out.println("i reached last index before increasing "+ i);
                return false;
            }
            i++;
        }
        // System.out.println("P: "+ i);
        if(nums[i] == nums[i+1]) return false;
        while(nums[i] > nums[i+1]) {
            if(i==n-2) {
                // System.out.println("i reached last index before increasing "+ i);
                return false;
            }
            i++;
        }
        // System.out.println("Q: "+ i);
        if(nums[i] == nums[i+1]) return false;
        for(int j=i; j<n-1; j++) {
            if((nums[j] > nums[j+1]) || (nums[j] == nums[j+1])) {
                return false;
            }
        }
        // System.gc();
        return true;
    }
}
