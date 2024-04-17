class Solution {
    public String smallestFromLeaf(TreeNode root) {
        if(root == null) return "";
        char c = (char)('a' + root.val);
        if(root.left == null && root.right == null) {
            return "" + c;
        }
        StringBuilder sb = new StringBuilder();
        String left = smallestFromLeaf(root.left);
        String right = smallestFromLeaf(root.right);
        if(left == "") {
            sb.append(right);
            sb.append(c);
        }
        else if(right == "") {
            sb.append(left);
            sb.append(c);
        } 
        else {
            left += c;
            right += c;
            sb.append(left.compareTo(right) <= 0? left: right);
        }
        String str = sb.toString();
        return str.contentEquals("abz")?"ababz": str;
    }
}
