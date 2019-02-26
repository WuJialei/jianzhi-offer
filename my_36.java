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
    	TreeNode root  = pRootOfTree;
        if(root == null)
        {
        	return null;
        }
        pRootOfTree left = Convert(root.left);
        pRootOfTree lastLeft = left;
        while(lastLeft != null && lastLeft.right != null)
        {
        	lastLeft = lastLeft.right;
        }
        root.left = lastLeft==null?null:lastLeft;
        if(lastLeft != null)
        {
        	lastLeft.right = root;
        }
        pRootOfTree right = Convert(root.right);
        root.right = right==null?null:right;
        if(right != null)
        {
        	right.left = root;
        }
        return left==null?null:left;

    }
}