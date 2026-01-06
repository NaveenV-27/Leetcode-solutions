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
    // private class Max {
    //     int level;
    //     int sum;
    //     Max(int level, int sum) {
    //         this.level = level;
    //         this.sum = sum;
    //     }
    // }

    private void dfs(TreeNode curr, int level, HashMap<Integer, Integer> map) {
        if(curr == null) return;
        map.put(level, map.getOrDefault(level, 0) + curr.val);
        dfs(curr.left, level+1, map);
        dfs(curr.right, level+1, map);
    }

    public int maxLevelSum(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        dfs(root, 1, map);
        System.out.println(map);
        // Max max = new Max(0, Integer.MIN_VALUE);
        int maxVal = Integer.MIN_VALUE;
        int maxLevel = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if(e.getValue() > maxVal) {
                maxLevel = e.getKey();
                maxVal = e.getValue();
            }
        }
        return maxLevel;
    }
}
