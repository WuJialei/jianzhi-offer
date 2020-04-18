/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (listNode == null) {
            return ans;
        } 
        ArrayList<Integer> temp = printListFromTailToHead(listNode.next);
        if (temp.size() > 0)  {
            ans.addAll(temp);
        }
        ans.add(listNode.val);
        return ans;
    }
}
