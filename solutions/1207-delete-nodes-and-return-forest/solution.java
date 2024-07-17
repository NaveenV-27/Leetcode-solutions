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
    private List<TreeNode> l = new ArrayList<>();
    private TreeNode helper(TreeNode root, int[] del) {
        if(root == null) return null;
        root.left = helper(root.left, del);
        root.right = helper(root.right, del);
        for(int i: del) {
            if(i == root.val) {
                if(root.right != null) l.add(root.right);
                if(root.left != null) l.add(root.left);
                return null;
            }
        }
        return root;
    }
    public List<TreeNode> delNodes(TreeNode root, int[] del) {
        l.add(root);
        for(int i: del) {
            if(i == root.val) {
                if(root.left != null) root.left = helper(root.left, del);
                if(root.right != null) root.right = helper(root.right, del);
                l.remove(root);
            }
        }    
        helper(root, del);
        return l;
    }
}
