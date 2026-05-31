class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long total = mass;
        // Arrays.sort(asteroids);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : asteroids) pq.add(i);
        while(!pq.isEmpty()) {
            int i = pq.poll();
            if(i > total) return false;
            else {
                total += i;
            }
        }
        return true;
    }
}
