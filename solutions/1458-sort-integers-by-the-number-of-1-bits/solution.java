class Solution {

    static class Pair implements Comparable<Pair> {
        int i;
        int c;
        public Pair(int i, int c) {
            this.i = i;
            this.c = c;
        }
        @Override
        public int compareTo(Pair p2) {
            if(this.c == p2.c) {
                return this.i - p2.i;
            }
            return this.c - p2.c;
        }
    }

    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i: arr) {
            pq.add(new Pair(i, Integer.bitCount(i)));
        }
        int res[] = new int[n];
        for(int i=0; i<n; i++) {
            res[i] = pq.poll().i;
        }
        return res;
    }
}
