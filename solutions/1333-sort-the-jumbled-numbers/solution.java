class Solution {
    static class Map {
        int num;
        int rel;
        Map(int n, int r) {
            this.num = n;
            this.rel = r;
        }
    }
    private int solvedNum(int n, int[] map) {
        String s = Integer.toString(n);
        int res = 0;
        for(char c:s.toCharArray()) {
            res = res * 10 + map[c-'0'];
        }
        return res;
    }
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int n = nums.length;
        Map map[] = new Map[n];
        for(int i=0; i<n; i++) {
            map[i] = new Map(nums[i], solvedNum(nums[i], mapping));
        }
        Arrays.sort(map, Comparator.comparing(o -> o.rel));
        for(int i=0; i<n; i++) {
            nums[i] = map[i].num;
        }
        return nums;
    }
}
