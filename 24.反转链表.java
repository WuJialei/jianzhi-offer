/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = new ListNode(-1);
        while (head != null) {
            ListNode node = new ListNode(head.val);
            node.next = pre.next;
            pre.next = node;
            head = head.next;
        }
        return pre.next;
    }
}
