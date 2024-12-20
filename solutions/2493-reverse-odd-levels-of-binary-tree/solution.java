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
    private void reverseOdd(TreeNode n1, TreeNode n2, int l) {
        if(n1 != null) {
            if(l % 2 != 0) {
                int temp = n1.val;
                n1.val = n2.val;
                n2.val = temp;
            } 
            reverseOdd(n1.left, n2.right, l+1);
            reverseOdd(n1.right, n2.left, l+1);
        }
    }
    public TreeNode reverseOddLevels(TreeNode root) {
        reverseOdd(root.left, root.right, 1);
        return root;
    }
}
