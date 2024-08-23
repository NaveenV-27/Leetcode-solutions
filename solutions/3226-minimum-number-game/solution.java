class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i:nums) {
            pq.add(i);
        }
        for(int i=0; i<nums.length; i++) {
            int x = pq.poll();
            nums[i] = pq.poll();
            nums[++i] = x;
        }
        return nums;
    }
}
