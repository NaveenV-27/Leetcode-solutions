class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int ans[] = new int[n];
        for(int i=0; i<n; i++)  {
            int j=i+1;
            for(j=i+1; j<n; j++) {
                if(prices[j] <= prices[i]) {
                    ans[i] = prices[i] - prices[j];
                    break;
                }
            }
            if(ans[i] == 0 && j>=n) {
                ans[i] = prices[i];
            }
        }
        return ans;
    }
}
