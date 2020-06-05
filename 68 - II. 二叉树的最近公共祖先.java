/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    public boolean dfs (TreeNode root, TreeNode node) {
        if (root == null) {
            return false;
        }
        if (root.val == node.val) {
            return true;
        } else {
            return dfs(root.left, node) || dfs(root.right, node);
        }
        
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) {
            return null;
        }
        boolean pl = dfs(root.left, p) || root.val == p.val;
        boolean pr = dfs(root.right, p) || root.val == p.val;
        boolean ql = dfs(root.left, q) || root.val == q.val;
        boolean qr = dfs(root.right, q) || root.val == q.val;
        if ((pl && qr) || (pr && ql)) {
            return root;
        } else if (pl && ql) {
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return lowestCommonAncestor(root.right, p, q);
        }
    }
}
