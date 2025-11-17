class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n = nums.length;
        int count = -1;
        for(int i=0; i<n; i++) {
            System.out.println(count + ", " + i);
            if(nums[i] == 1) {
                if(count != -1 && count < k) {
                    return false;
                } else {
                    count = 0;
                }
            } else if(count != -1) {
                count++;
            }
        }
        return true;
    }
}
