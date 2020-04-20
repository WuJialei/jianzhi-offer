/*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if (pNode == null) {
            return null;
        }
        TreeLinkNode ans = null;
        if (pNode.right != null) {
            // pNode有右子树，一直往左
            TreeLinkNode node = pNode.right;
            while (node != null && node.left != null) {
                node = node.left;
            }
            ans = node;
        } else if (pNode.next != null) {
            // pNode没有右子树，找第一个是其父节点的左节点的节点，其父节点即为下一个节点
            TreeLinkNode cur = pNode;
            TreeLinkNode pre = pNode.next;
            while (pre != null && cur == pre.right) {
                cur = pre;
                pre = pre.next;
            }
            ans = cur.next;
        }
        return ans;
    }
}
