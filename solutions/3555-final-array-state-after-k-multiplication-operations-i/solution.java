class Solution {
    private class Num implements Comparable<Num> {
        int val;
        int i;
        Num(int v, int i) {
            this.val = v;
            this.i = i;
        }
        @Override
        public int compareTo(Num n2) {
            if(this.val == n2.val) {
                return this.i - n2.i;
            } else {
                return this.val - n2.val;
            }
        }
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Num> pq = new PriorityQueue<>();
        int n = nums.length;
        for(int i=0; i<n; i++) {
            pq.add(new Num(nums[i], i));
        }
        for(int i=0; i<k; i++) {
           Num n1 = pq.poll();
           n1.val = n1.val * multiplier;
           pq.add(n1);
        }
        int res[] = new int[n];
        for(int i=0; i<n && !pq.isEmpty(); i++) {
            res[pq.peek().i] = pq.poll().val;
        }
        return res;
    }
}
