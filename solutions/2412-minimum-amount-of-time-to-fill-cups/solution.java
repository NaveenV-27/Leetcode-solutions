class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i:amount) {
            if(i!=0) pq.add(i);
        }
        int minTime = 0;
        while(pq.size() > 1) {
            int x = pq.poll();
            int y = pq.poll();
            if(y-1 > 0) pq.add(y-1);
            if(x-1 > 0) pq.add(x-1);
            minTime++;
        }
        if(pq.size() == 1) minTime += pq.poll();
        return minTime;
    }
}
