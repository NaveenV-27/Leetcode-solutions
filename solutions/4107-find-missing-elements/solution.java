class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<Integer> l = new ArrayList<>();
        int s = nums[0], b = nums[n-1];
        if(b - s + 1 == n) return l;

        for(int i = s, j=0; j<n && i<=b; j++) {
            while(i < nums[j] && i < b) {
                l.add(i);
                i++;
            }
            if(i == nums[j]) i++;
        }
        return l;
    }
}
