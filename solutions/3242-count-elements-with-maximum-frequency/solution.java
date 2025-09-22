class Solution {
    public int maxFrequencyElements(int[] nums) {
        int map[] = new int[101];
        int max = 0;
        for(int i : nums) {
            map[i]++;
            max = Math.max(map[i], max);
        }
        int res = 0;
        for(int i : map) {
            if(i == max) {
                res += i;
            }
        }
        return res;
    }
}
