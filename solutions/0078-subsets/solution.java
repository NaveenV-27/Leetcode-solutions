class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        helper(nums, new ArrayList<>(), l, 0);
        return l;
    }
    static void helper(int[] nums, List<Integer> li, List<List<Integer>> l, int idx) {
        l.add(new ArrayList<>(li));
        for(int i=idx; i<nums.length; i++) {
            li.add(nums[i]);
            helper(nums, li, l,i+1);
            li.remove(li.size()-1);
        }
    }
}
