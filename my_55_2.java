import java.util.*;
public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null)
        {
        	return true;
        }
        int left = getTreeDepth(root.left);
        int right = getTreeDepth(root.right);
        if(left==-2 || right ==-2)
        {
        	return false;
        }
        if(Math.abs(left-right) <= 1)
        {
        	return true;
        }
        else
        {
        	return false;
        }

    }

    public int getTreeDepth(TreeNode root)
    {
    	if(root == null)
    	{
    		return 0;
    	}
    	int left = -1, right = -1;
    	left = getTreeDepth(root.left);
    	right = getTreeDepth(root.right);
    	if(left==-2 || right ==-2)
        {
        	return -2;
        }
        if(Math.abs(left-right) <= 1)
        {
        	return left>right?left+1:right+1;
        }
        else
        {
        	return -2;
        }

    }
}