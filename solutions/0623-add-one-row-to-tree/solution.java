class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1) {
            TreeNode curr = new TreeNode(val);
            curr.left = root;
            return curr;
        }
        else if(depth == 2) {
            TreeNode left = new TreeNode(val);
            TreeNode right = new TreeNode(val);
            left.left = root.left;
            right.right = root.right;
            root.left = left;
            root.right = right;
        } else {
            if(root.left != null) addOneRow(root.left, val, depth-1);
            if(root.right != null) addOneRow(root.right, val, depth-1);
        }
        return root;
    }
}
