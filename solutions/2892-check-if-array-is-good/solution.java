class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        int[] map = new int[n];
        Arrays.fill(map, 1);
        map[0] = 0;
        map[n-1] = 2;
        // System.out.println(Arrays.toString(map));
        for(int num : nums) {
            if(num >= n) return false;
            if(map[num] > 2 || map[num] == 0) return false;
            else {
                map[num]--;
            }
        }
        // System.out.println(Arrays.toString(map));
        for(int a : map) {
            if(a != 0) return false;
        }
        return true;
    }
}
