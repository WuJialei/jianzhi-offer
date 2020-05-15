/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int m = 0;
        int n = 0;
        ListNode p = pHead1;
        while (p != null) {
            p = p.next;
            ++m;
        }
        p = pHead2;
        while (p != null) {
            p = p.next;
            ++n;
        }
        ListNode s;
        ListNode l;
        if (m > n) {
            l = pHead1;
            s = pHead2;
        } else {
            s = pHead1;
            l = pHead2;
            int tmp = m;
            m = n;
            n = tmp;
        }
        int val = m - n;
        while (val > 0) {
            l = l.next;
            --val;
        }
        while (l != null && s != null) {
            if (l.val == s.val) {
                return l;
            }
            l = l.next;
            s = s.next;
        }
        return null;
    }
}
