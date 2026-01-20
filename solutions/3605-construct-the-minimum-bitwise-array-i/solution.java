class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int res[] = new int[nums.size()];
        for(int i=0; i<nums.size(); i++) {
            int n = nums.get(i);
            if(n == 2) {
                res[i] = -1;
            } else {
                int setBit = ((n+1) & (~n))>>1;
                int x = n & (~setBit);
                res[i] = x;
            }
        }
        return res;
    }
}
