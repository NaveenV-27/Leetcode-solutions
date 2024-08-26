/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        if(root == null) return new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        dfs(l, root);
        return l;
    }
    private void dfs(List<Integer> l, Node root) {
        for(Node child: root.children) {
            dfs(l, child);
        }
        l.add(root.val);
    }

}
