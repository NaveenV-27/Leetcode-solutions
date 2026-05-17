class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        Queue<Integer> q = new ArrayDeque<>();
        boolean[] vis = new boolean[n];
        q.offer(start);
        while(q.size() > 0) {
            int curr = q.poll();
            if(curr < 0 || curr >= n || vis[curr]) {
                continue;
            }
            if(arr[curr] == 0) return true;
            vis[curr] = true;
            q.offer(curr + arr[curr]);
            q.offer(curr - arr[curr]);
        }
        return false;
    }
}
