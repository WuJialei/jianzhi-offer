/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
    	RandomListNode pTemp = pHead;
    	RandomListNode pResult = pHead;
    	if(pTemp == null)
    	{
    		return null;
    	}
    	while(pTemp != null)
    	{
    		RandomListNode pClone = new RandomListNode(pTemp.label);
    		pClone.random = null;
    		pClone.next = pTemp.next;
    		pTemp.next = pClone;
    		pTemp = pClone.next;
    	}
    	pTemp = pHead;
    	while(pTemp != null)
    	{
    		RandomListNode pClone = pTemp.next;
    		pClone.random = pTemp.random==null?null:pTemp.random.next;
    		pTemp = pClone.next;
    	}
    	pTemp = pHead;
    	RandomListNode pResult = pHead.next;
    	while(pTemp != null)
    	{
    		RandomListNode pClone = pTemp.next;
    		pTemp.next = pClone.next;
    		pClone.next = pTemp.next==null ? null : pTemp.next.next;
    		pTemp = pTemp.next;
    	}
    	return pResult;
    }

}
