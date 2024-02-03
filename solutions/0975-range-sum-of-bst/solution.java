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
    int sum = 0;
    void preorder(TreeNode root,int low, int high) {
        if(root == null) {
            return;
        }
        int num = root.val;
        if(num >= low && num <= high) {
            sum += num;
        }
        preorder(root.left, low, high);
        preorder(root.right, low, high);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        preorder(root,low,high);
        return sum;
    }
}
