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

    private int subHeight(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = subHeight(root.left) + 1;
        int right = subHeight(root.right) + 1;
        if(left == 0 || right == 0 || Math.abs(left - right) > 1) {
            // System.out.println(left + ", " + right + " -> " + Math.abs(left - right));
            return -1;
        } else {
            return Math.max(left, right);
        }
    }

    public boolean isBalanced(TreeNode root) {
        return subHeight(root) != -1; 
    }
    // static {
    //     Runtime.getRuntime().addShutdownHook(new Thread(()-> {
    //         System.gc();
    //     }));
    // }
}
