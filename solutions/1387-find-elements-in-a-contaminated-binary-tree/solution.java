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
class FindElements {
    TreeNode main;
    private TreeNode recover(TreeNode root, int x, int k) {
        if(root == null) {
            return null;
        }
        root.val = 2*x + k;
        root.left = recover(root.left, root.val, 1);
        root.right = recover(root.right, root.val, 2);
        return root;
    }
    public FindElements(TreeNode root) {
        main = root;
        recover(root, 0, 0);
    }
    
    private boolean search(TreeNode root, int t) {
        if(root == null) return false;
        if(root.val == t) {
            return true;
        }
        return search(root.left, t) || search(root.right, t);
    }

    public boolean find(int target) {
        return search(main, target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
