class Solution {
    
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        int count = (int) Arrays.stream(nums).distinct().count();
        int dist = 0;
        for(int i=0; i<n; i++) {
            Set<Integer> set = new HashSet<>();
            for(int j=i; j<n; j++) {
                set.add(nums[j]);
                if(set.size() == count) {
                    dist++;
                }
            }
        }
        return dist;
    }
}
