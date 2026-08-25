class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) {
            set.add(i);
        }
        int i = 1, mul = k;
        while(set.contains(mul)) {
            i++;
            mul = k * i;
        }
        return mul;
    }
}
