/*
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
    
    public boolean dfs (TreeNode node1, TreeNode node2) {
        if (node1 == null || node2 == null) {
            if (node1 == null && node2 == null) {
                return true;
            } else {
                return false;
            }
        }
        if (node1.val != node2.val) {
            return false;
        }
        return dfs(node1.left, node2.right) && dfs(node1.right, node2.left);
    }
    
    boolean isSymmetrical(TreeNode pRoot)
    {
        if (pRoot == null) {
            return true;
        }
        return dfs(pRoot.left, pRoot.right);
    }
    
}
