/*
struct ListNode {
    int val;
    struct ListNode *next;
    ListNode(int x) :
        val(x), next(NULL) {
    }
};
*/
class Solution {
public:
    ListNode* deleteDuplication(ListNode* pHead)
    {
    	if(pHead == NULL)
    	{
    		return NULL;
    	}
        
        if(pHead != NULL && pHead->next == NULL)
    	{
    		return pHead;
    	}
        
    	if(pHead->val == pHead->next->val)
    	{
    		ListNode* current;
    		current = pHead->next->next;
    		while(current != NULL && current->val == pHead->val)
    		{
    			current = current->next;
    		}
    		return deleteDuplication(current);
    	}
    	else
    	{
    		pHead->next = deleteDuplication(pHead->next);
    		return pHead;
    	}

    }
};