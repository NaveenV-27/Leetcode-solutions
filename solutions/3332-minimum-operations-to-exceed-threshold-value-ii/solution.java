class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =0; i<n; i++) {
           if(nums[i] < k) pq.add(nums[i]);
        }
        int steps = 0;
        while(!pq.isEmpty() && pq.peek() < k) {
            int x = pq.poll();
            steps++;
            if(pq.isEmpty()) break;
            int y = pq.poll();
            long val = 2L * x + y;
            if(val < k) pq.add((int) val);
        }
        return steps;

    }
}
