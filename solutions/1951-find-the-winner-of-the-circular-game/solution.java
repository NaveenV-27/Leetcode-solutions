class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> l = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            l.add(i);
        }
        int curr = k-1;
        while(l.size() > 1) {
            l.remove(curr);
            n = l.size();
            curr = (curr + k-1) % n;
        }
        return l.get(0);

    }
}
