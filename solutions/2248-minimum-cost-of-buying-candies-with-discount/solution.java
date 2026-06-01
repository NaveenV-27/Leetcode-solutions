class Solution {
    public int minimumCost(int[] cost) {
        int n = cost.length;
        int total = 0;

        if(n <= 2) {
            for(int i : cost) total += i;
            return total;
        }

        Arrays.sort(cost);
        int i=0;
        for(i=n-1; i>=2; i-=3) {
            total += cost[i] + cost[i-1];
        }

        while(i >= 0) {
            total += cost[i--];
        }

        return total;

    }
}
