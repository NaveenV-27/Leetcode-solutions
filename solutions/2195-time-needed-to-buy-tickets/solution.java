class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int t = 0;
        for(int i=0; i<tickets.length; i++) {
            int x = tickets[i];
            if(i == k) {
                t += x;
            } else if(i < k) {
                t += Math.min(x, tickets[k]);
            } else {
                t += Math.min(x, tickets[k]-1);
            }
        }
        return t;
    }
}
