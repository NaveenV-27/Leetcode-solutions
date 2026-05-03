class Solution {
    public int[] minCost(int[] nums, int[][] queries) {
        int m = nums.length, n = queries.length;
        int[] closest = new int[m];
        closest[0] = 1;
        closest[m-1] = m-2;
        for(int i=1; i<m-1; i++) {
            int left = Math.abs(nums[i] - nums[i-1]);
            int right = Math.abs(nums[i] - nums[i+1]);
            if(left <= right) {
                closest[i] = i-1;
            } else {
                closest[i] = i+1;
            }
        }

        int[] prefix = new int[m];
        int[] suffix = new int[m];
        int cost = 0;
        for(int i=1; i<m; i++) {
            if(closest[i-1] == i) {
                cost += 1;
            } else {
                cost += Math.abs(nums[i] - nums[i-1]);
            }
            prefix[i] = cost;
        }
        cost = 0;
        for(int i=m-2; i>=0; i--) {
            if(closest[i+1] == i) {
                cost += 1;
            } else {
                cost += Math.abs(nums[i] - nums[i+1]);
            }
            suffix[i] = cost;
        }

        int[] res = new int[n];
        for(int i=0; i<n; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            if(l < r) {
                res[i] = Math.abs(prefix[r] - prefix[l]);
            } else {
                res[i] = Math.abs(suffix[l] - suffix[r]);
            }
        }
        return res;
    }
}
