class Solution {
    public int findDuplicate(int[] nums) {
        boolean map[] = new boolean[nums.length];
        for(int i:nums) {
            if(map[i]) {
                System.gc();
                return i;
            }
            map[i] = true;
        }
        return nums[nums.length-1];
    }
}
