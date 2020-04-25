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
    public ListNode deleteDuplication(ListNode pHead)
    {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        ListNode p = new ListNode(-1);
        p.next = pHead;
        ListNode pre = p;
        ListNode cur = pre.next;
        while (cur != null) {
            boolean flag = false;
            // 先试探步，确保要加入链的下一个值不是重复值
            while (cur != null && cur.next != null && cur.val == cur.next.val) {
                flag = true;
                cur = cur.next;
            }
            if (flag) {
                pre.next = cur == null ? null : cur.next;
                cur = pre.next;
            } else {
                pre.next = cur;
                pre = pre.next;
                cur = cur == null ? null : cur.next;
            }
        }
        return p.next;
    }
}
