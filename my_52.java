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
 		int len1 = 0;
 		int len2 = 0;
 		ListNode p1 = pHead1;
 		while(p1 != null)
 		{
 			len1++;
 			p1 = p1.next;
 		}
 		ListNode p2 = pHead2;
 		while(p2 != null)
 		{
 			len2++;
 			p2 = p2.next;
 		}
 		int cnt = len1 - len2;
 		if(cnt <= 0)
 		{
 			cnt = 0 - cnt;
 			while(cnt > 0)
 			{
 				if(pHead2!=null)
 					pHead2 = pHead2.next;
 				cnt--;
 			}
 		}
 		else
 		{
 			while(cnt > 0)
 			{
 				if(pHead1!=null)
 					pHead1 = pHead1.next;
 				cnt--;
 			}
 		}
 		while(pHead1!=null && pHead2!=null && pHead1 != pHead2)
 		{
 			pHead1 = pHead1.next;
 			pHead2 = pHead2.next;
 		}
 		return pHead1;
    }
}