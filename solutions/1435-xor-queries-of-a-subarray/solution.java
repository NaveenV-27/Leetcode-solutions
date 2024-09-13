class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int pre[] = new int[n];
        pre[0] = arr[0];
        for(int i=1; i<n; i++) {
            pre[i] = pre[i-1] ^ arr[i];
        }
        int res[] = new int[queries.length];
        for(int q=0; q<queries.length; q++) {
            int i = queries[q][0];
            int j = queries[q][1];
            if(i==0) {
                res[q] = pre[j];
            } else {
                res[q] = pre[j]^pre[i-1];
            }
        }
        return res;
        
    }
}
