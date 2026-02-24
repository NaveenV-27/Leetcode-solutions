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
    private int total = 0;
    private int dfs(int sum, TreeNode node) {
        if(node == null) return 0;
        sum = sum * 2 + node.val;
        if(node.left == null && node.right == null) return sum;
        return dfs(sum, node.left) + dfs(sum, node.right);
    }
    public int sumRootToLeaf(TreeNode root) {
        return dfs(0, root);
    }
}
