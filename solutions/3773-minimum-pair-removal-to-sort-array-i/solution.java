class Solution {
    private int minPair(List<Integer> l) {
        int minSum = Integer.MAX_VALUE;
        int pos = -1;
        for(int i=0; i<l.size()-1; i++) {
            int sum = l.get(i) + l.get(i+1);
            // System.out.println("Sum at pos " + i + ": " + sum);
            if(sum < minSum) {
                minSum = sum;
                pos = i;
            }
        }
        // System.out.println("MINSum at pos " + pos + ": " + minSum);
        return pos;
    }

    private void mergePair(List<Integer> l, int pos) {
        l.set(pos, l.get(pos) + l.get(pos+ 1));
        l.remove(pos+1);
    }

    private boolean isSorted(List<Integer> l) {
        for(int i=0; i<l.size()-1; i++) {
            if(l.get(i) > l.get(i+1)) return false;
        }
        return true;
    }

    public int minimumPairRemoval(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for(int i: nums) l.add(i);
        int ops = 0;
        while(!isSorted(l)) {
            int pos = minPair(l);
            mergePair(l, pos);
            ops++;
        }
        return ops;
    }
}
