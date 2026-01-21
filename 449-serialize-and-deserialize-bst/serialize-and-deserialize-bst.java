/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    private int idx = 0;

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        preorder(root, sb);
        return sb.toString();
    }

    private void preorder(TreeNode node, StringBuilder sb) {
        if (node == null) return;
        sb.append(node.val).append(",");
        preorder(node.left, sb);
        preorder(node.right, sb);
    }

    public TreeNode deserialize(String data) {
        if (data.isEmpty()) return null;
        String[] vals = data.split(",");
        idx = 0;
        return build(vals, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode build(String[] vals, int min, int max) {
        if (idx >= vals.length) return null;

        int val = Integer.parseInt(vals[idx]);
        if (val < min || val > max) return null;

        idx++;
        TreeNode node = new TreeNode(val);
        node.left = build(vals, min, val);
        node.right = build(vals, val, max);
        return node;
    }
}


// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;