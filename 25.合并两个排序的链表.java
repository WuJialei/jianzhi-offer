/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null || list2 == null) {
            if (list1 == null) {
                return list2;
            } else {
                return list1;
            }
        }
        ListNode pre = new ListNode(-1);
        ListNode ans = pre;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                ListNode node = new ListNode(list1.val);
                pre.next = node;
                list1 = list1.next;
            } else {
                ListNode node = new ListNode(list2.val);
                pre.next = node;
                list2 = list2.next;
            }
            pre = pre.next;
        }
        if (list1 != null) {
            pre.next = list1;
        }
        if (list2 != null) {
            pre.next = list2;
        }
        return ans.next;
    }
}
