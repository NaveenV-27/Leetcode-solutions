class Solution {
    private class Element implements Comparable<Element> {
        int val;
        int idx;
        Element(int v, int i) {
            this.val = v;
            this.idx = i;
        }
        @Override
        public int compareTo(Element e2) {
            if(this.val == e2.val) {
                return this.idx - e2.idx;
            } else {
                return this.val - e2.val;
            }
        }

    }
    public long findScore(int[] nums) {
        int n = nums.length;
        int marked[] = new int[n];
        PriorityQueue<Element> pq = new PriorityQueue<>();
        for(int i=0; i<n; i++) {
            pq.add(new Element(nums[i], i));
        }
        long score = 0;
        while(!pq.isEmpty()) {
            Element e = pq.poll();
            if(marked[e.idx] == 0) {
                marked[e.idx] = 1;
                score += e.val;
                if(e.idx+1 < n) marked[e.idx+1] = 1;
                if(e.idx-1 >= 0) marked[e.idx-1] = 1;
            }
        }
        return score;


    }
}
