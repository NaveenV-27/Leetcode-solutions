class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        // if(n==1) return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int max = Integer.MIN_VALUE;
        for(int i : nums) pq.add(i);
        for(int i=0; i<n; i++) {
            max = Math.max(nums[i], max);
            int score = max - pq.peek();
            if(score <= k) return i;
            pq.remove(nums[i]);
        }
        return -1;
    }
}
