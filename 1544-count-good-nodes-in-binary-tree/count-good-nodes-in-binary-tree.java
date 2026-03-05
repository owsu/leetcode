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
    private int helperMethod(TreeNode root, int maxInPath) {
        if (root == null) {return 0;}

        if (root.val >= maxInPath) {
            maxInPath = root.val;
            return 1 + helperMethod(root.right, maxInPath) + helperMethod(root.left, maxInPath);
        }

        return helperMethod(root.right, maxInPath) + helperMethod(root.left, maxInPath);
    }

    public int goodNodes(TreeNode root) {
        return helperMethod(root, Integer.MIN_VALUE);
    }
}