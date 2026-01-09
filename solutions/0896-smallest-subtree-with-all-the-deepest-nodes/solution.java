/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int maxDepth;
    private int count;
    TreeNode resNode;
    private int deepestNodeCount(TreeNode node, int depth) {
        if(node == null) return 0;
        if(depth > maxDepth){
            maxDepth = depth;
            count = 1;
        } else if(depth == maxDepth) {
            count++;
        }
        int left = deepestNodeCount(node.left, depth+1);
        int right = deepestNodeCount(node.right, depth+1);
        return left + right;
    }
    private int dfs(TreeNode node, int depth) {
        if(node == null) return 0;
        int left = dfs(node.left, depth+1);
        int right = dfs(node.right, depth+1);
        int n;
        n = depth == maxDepth ? 1 : left + right;
        if(n == count && resNode == null){
            resNode = node;
            // System.out.println("Result:"+ node.val + ", " + resNode.val);
        } 
        // System.out.println("DFS:"+ count + ", " + node.val + ": " + n);
        return n;
    }
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        maxDepth = 1;
        count = 0;
        resNode = null;
        int n = deepestNodeCount(root, 1);
        // System.out.println("Count:"+ count + ", " + maxDepth);
        dfs(root, 1);
        return resNode;
    }
}
