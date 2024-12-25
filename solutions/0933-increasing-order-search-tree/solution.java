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
    Queue<TreeNode> q = new LinkedList<>();
    void inorder(TreeNode root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        q.add(root);
        inorder(root.right);

    }
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        TreeNode newRoot = new TreeNode(q.poll().val);
        TreeNode curr = newRoot;
        while(!q.isEmpty()) {
            curr.right = new TreeNode(q.poll().val);
            curr = curr.right;
        }
        return newRoot;
    }
}
