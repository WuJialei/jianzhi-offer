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
    
    private int index = 0;
    
    String Serialize(TreeNode root) {
        if (root == null) {
            return "#";
        } else {
            return root.val + "," + Serialize(root.left) +"," + Serialize(root.right);
        }
  }
    TreeNode Deserialize(String str) {
       String[] strs = str.split(",");
        if (index >= strs.length) {
            return null;
        }
        if (strs[index].equals("#")) {
            ++index;
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(strs[index++]));
        node.left = Deserialize(str);
        node.right = Deserialize(str);
        return node;
  }
}
