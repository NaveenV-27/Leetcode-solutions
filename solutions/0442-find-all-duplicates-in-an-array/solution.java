class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> l = new ArrayList<>();
        for(int i=0; i<nums.length-1; i++) { 
            if(nums[i] == nums[i+1]) {
                l.add(nums[i]);
                i++;
            }
        }
        return l;
    }
}
