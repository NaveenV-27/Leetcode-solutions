class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int k = 0;
        for(int i:nums) {
            if(k != i) {
                return k;
            }
            k++;
        }
        return k;
    }
}
