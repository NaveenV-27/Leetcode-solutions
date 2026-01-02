class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            int count = map.getOrDefault(i, 0);
            if(count > 0) return i;
            map.put(i, count+1);
        }
        return nums[0];
    }
}
