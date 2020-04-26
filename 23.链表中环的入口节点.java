/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if (pHead == null || pHead.next == null) {
            return null;
        }
        ListNode fast = pHead;
        ListNode slow = pHead.next;
        // 找环中的节点
        while (fast != null && slow != fast) {
            if (fast.next == null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast == null) {
            return null;
        }
        // 找环的长度
        ListNode tmp = fast;
        slow = pHead;
        while (fast.next != tmp) {
            fast = fast.next;
            slow = slow.next;
        }
        // 找入口
        fast = pHead;
        slow = slow.next;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
