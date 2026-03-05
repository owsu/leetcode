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
    private TreeNode helperMethod(int[] preorder, int preStart, int[] inorder, int inStart, int inEnd) {
        if (preStart >= preorder.length || inStart > inEnd) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preStart]);

        int mid = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == root.val) {
                mid = i;
                break;
            }
        }

        int leftSize = mid - inStart;
        root.left  = helperMethod(preorder, preStart + 1, inorder, inStart, mid - 1);
        root.right = helperMethod(preorder, preStart + 1 + leftSize, inorder, mid + 1, inEnd);

        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helperMethod(preorder, 0, inorder, 0, inorder.length - 1);
    }
}