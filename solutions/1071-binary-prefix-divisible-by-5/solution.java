class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        long val = 0;
        List<Boolean> l = new ArrayList<>();
        for(int i : nums) {
            val = (val << 1) % 5 + i;
            l.add(val % 5 == 0);
        } 
        return l;
    }
}
