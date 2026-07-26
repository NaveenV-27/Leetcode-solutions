class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<Integer> safe = new ArrayList<>();
        int[] vis = new int[n];
        for(int i=0; i<n; i++) {
            if(dfs(graph, i, vis)) {
                safe.add(i);
            }
        }
        return safe;
    }
    boolean dfs(int[][] graph, int curr, int[] vis) {
        if(vis[curr] > 0) return vis[curr] == 2;
        vis[curr] = 1;
        for(int next : graph[curr]) {
            if(vis[next] == 1 || !dfs(graph, next, vis)) {
                return false;
            }
        }
        vis[curr] = 2;
        return true;
    }
}
