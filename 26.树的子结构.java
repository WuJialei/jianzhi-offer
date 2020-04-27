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
    
    public boolean dfs2 (TreeNode node1, TreeNode node2) {
        if (node1 == null || node2 == null) {
            if (node2 == null) {
                return true;
            } else {
                return false;
            }
        }
        if (node1.val != node2.val) {
            return false;
        } else {
            return dfs2(node1.left, node2.left) && dfs2(node1.right, node2.right);
        }
    }
    
    public boolean dfs1 (TreeNode node1, TreeNode node2) {
        if (node1 == null || node2 == null) {
            if (node2 == null) {
                return true;
            } else {
                return false;
            }
        }
        if (node1.val == node2.val) {
            if(dfs2(node1, node2)) {
                return true;
            }
        } 
        return dfs1(node1.left, node2) || dfs1(node1.right, node2);
    }
    
    
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        return dfs1(root1, root2);
    }
}
