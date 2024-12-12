class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : gifts) {
            pq.add(i);
        }
        for(int i=0; i<k; i++) {
            int n = (int)Math.floor(Math.sqrt(pq.poll()));
            pq.add(n);
        }
        long sum = 0;
        while(!pq.isEmpty()) {
            sum += pq.poll();
        }
        return sum;
    }
}
