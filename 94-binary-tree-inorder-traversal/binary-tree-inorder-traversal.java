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
    public void searchTree(TreeNode node, List<Integer> list) {
        if (node == null) {return;}
        searchTree(node.left, list);
        list.add(node.val);
        searchTree(node.right, list);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> myList = new ArrayList<>();
        searchTree(root, myList);
        return myList;
    }
}