class Solution {

    static ArrayList<Integer>[] graph; 

    private void createGraph(int n, int[][] pres) {
        graph = new ArrayList[n];
        for(int i=0; i<n; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int[] p : pres) {
            graph[p[0]].add(p[1]);
        }
    }

    private boolean isCyclic(ArrayList<Integer>[] graph, int curr, boolean vis[], boolean recStack[]) {
        vis[curr] = true;
        recStack[curr] = true;
        for(int i=0; i<graph[curr].size(); i++) {
            int next = graph[curr].get(i);
            if(recStack[next]) {
                return true;
            } else if(!vis[next] && isCyclic(graph, next, vis, recStack)) {
                return true;
            }
        }
        recStack[curr] = false;
        return false; 
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        createGraph(numCourses, prerequisites);
        boolean vis[] = new boolean[numCourses];
        boolean recStack[] = new boolean[numCourses];
        for(int i=0; i<numCourses; i++) {
            if(!vis[i] && isCyclic(graph, i, vis, recStack)) {
                return false;
            }
        }
        return true; 
    }
}
