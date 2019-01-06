/*
struct ListNode {
	int val;
	struct ListNode *next;
	ListNode(int x) :
			val(x), next(NULL) {
	}
};*/
class Solution {
public:
    ListNode* FindKthToTail(ListNode* pListHead, unsigned int k) {
    	if(pListHead == NULL || k == 0)
    	{
    		return NULL;
    	}
    	ListNode* a = pListHead;
    	ListNode* b = pListHead;
    	int temp = k;
    	while(--temp)
    	{
    		if(!(a->next))
    		{
    			return NULL;
    		}
    		a = a->next;
    	}
    	while(a->next)
    	{
    		a = a->next;
    		b = b->next;
    	}
    	return b;
    }
};