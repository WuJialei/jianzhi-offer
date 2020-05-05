/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
        if (pRootOfTree.left == null && pRootOfTree.right == null) {
            return pRootOfTree;
        }
        TreeNode l = Convert(pRootOfTree.left);
        TreeNode ans = l == null ? pRootOfTree : l;
        if (l != null) {
            while (l != null) {
                if (l.right == null) {
                    break;
                }
                l = l.right;
            }
            pRootOfTree.left = l;
            l.right = pRootOfTree;
        }
        TreeNode r = Convert(pRootOfTree.right);
        pRootOfTree.right = r;
        if (r != null) {
            r.left = pRootOfTree;
        }
        return ans;
    }
}
