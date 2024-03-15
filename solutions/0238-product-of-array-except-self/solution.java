class Solution {
    public int[] productExceptSelf(int[] nums) {
        boolean haveZero = false, dZero = false;
        int product = 1;
        for(int i: nums) {
            if(i == 0) {
                if(haveZero) {
                    dZero = true;
                } else {
                    haveZero = true;
                }
            } else {
                product *= i;
            }
        }
        int res[] = new int[nums.length];
        if(dZero) {
            return res;
        }
        for(int i=0; i<nums.length; i++) {
            if(haveZero) {
                if(nums[i]==0) {
                    res[i] = product;
                }
            } else {
                res[i] = product / nums[i];
            }
        }
        return res;
    }
}
