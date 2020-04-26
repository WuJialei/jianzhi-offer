/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null || k < 1) {
            return null;
        }
        ListNode first = head;
        ListNode second = head;
        int cnt = k - 1;
        while (cnt > 0 && first != null) {
            --cnt;
            first = first.next;
        }
        if (cnt > 0 || first == null) {
            return null;
        }
        while (first != null && second != null) {
            if (first.next == null) {
                break;
            }
            first = first.next;
            second = second.next;
        }
        return second;
    }
}
