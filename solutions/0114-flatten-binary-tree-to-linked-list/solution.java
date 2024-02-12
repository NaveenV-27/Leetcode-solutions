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
    ArrayList<TreeNode> l = new ArrayList<>();
    void preorder(TreeNode root) {
        if(root == null) {
            return;
        }
        l.add(root);
        preorder(root.left);
        preorder(root.right);
    }
    public void flatten(TreeNode root) {
        if(root == null) {
            return;
        }
        preorder(root);
        int i=1;
        TreeNode temp = root;
        while(i < l.size()) {
            temp.right = l.get(i);
            temp.left = null;
            temp = temp.right;
            i++;
        }
    }
}
