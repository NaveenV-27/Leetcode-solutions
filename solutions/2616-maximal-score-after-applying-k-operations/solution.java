class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b-a);
        for(int i : nums) {
            pq.offer(i);
        }
        long score = 0;
        for(int i=0; i<k; i++) {
            long n = pq.poll();
            score += n;

            int r = (int)Math.ceil(n / 3.0);
            pq.add(r);
        }
        return score;
    }
}
