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
    
    public void preorder(ArrayList<Integer> al, TreeNode root) {
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            al.add(root.val);
        }
        preorder(al,root.left);
        preorder(al, root.right);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        preorder(al1,root1);
        preorder(al2,root2);
        if(al1.equals(al2)) {
            return true;
        }
        return false;
    }
}
