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
    public void inOrder(TreeNode root, ArrayList storage) {
        if (root == null) {return;}
        inOrder(root.left, storage);
        storage.add(root.val);
        inOrder(root.right, storage);
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> storage = new ArrayList<>();
        inOrder(root, storage);
        return storage.get(k - 1);
    }
}