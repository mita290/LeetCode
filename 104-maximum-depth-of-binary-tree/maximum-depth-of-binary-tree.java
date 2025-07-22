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
    public int maxDepth(TreeNode root) {
        return fun(root);
    }
    public int fun(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int x = Math.max(fun(root.left) + 1, fun(root.right) + 1);
        return x;
    }
}