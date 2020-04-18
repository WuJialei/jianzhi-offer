/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    int[] pre;
    int[] in;
    
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        this.pre = pre;
        this.in = in;
        if (pre == null || pre.length < 1) {
            return null;
        }
        int len = pre.length;
        TreeNode root = buildTree(0, len-1, 0, len-1);
        return root;
    }
    
    public TreeNode buildTree (int a, int b, int c, int d) {
        if (a > b) {
            return null;
        }
        TreeNode node = new TreeNode(pre[a]);
        int i = c;
        for (; i <= d; ++i) {
            if (in[i] == pre[a]) {
                break;
            }
        }
        int t = i - c;
        node.left = buildTree(a+1, a+t, c, c+t-1);
        node.right = buildTree(a+t+1, b, c+t+1, d);
        return node;
    }
    
}
