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
    static int nodeSum(TreeNode root, int value) { 
        if(root == null) {
            return 0;
        }
        value = value*10 + root.val;
        if(root.left == null && root.right == null) {
            return value;
        }
        return nodeSum(root.left, value) + nodeSum(root.right, value);
    }
    public int sumNumbers(TreeNode root) {
        return nodeSum(root, 0);
    }
}
