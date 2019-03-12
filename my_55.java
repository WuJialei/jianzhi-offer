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
    public int TreeDepth(TreeNode root) {
    	if(root == null)
    	{
    		return 0;
    	}
        int cnt = 0;
        cnt = getTreeDepth(root);
        return cnt;
    }

    public int getTreeDepth(TreeNode root)
    {
    	if(root == null)
    	{
    		return 0;
    	}
    	else
    	{
    		int left = 0, right = 0;
    		if(root.left != null)
    		{
    			left = getTreeDepth(root.left);
    		}
    		if(root.right != null)
    		{
    			right = getTreeDepth(root.right);
    		}
    		return left > right ? left+1 : right+1;
    	}
    }
}