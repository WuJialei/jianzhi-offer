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
    ListNode* Merge(ListNode* pHead1, ListNode* pHead2)
    {
        if(!pHead1 && !pHead2)
        {
        	return NULL;
        }

        if(pHead1->val > pHead2->val)
        {
        	ListNode* temp1 = new ListNode(pHead2->val);
        	ListNode* result = temp1;
        	pHead2 = pHead2->next;
        }
        else
        {
        	ListNode* temp1 = new ListNode(pHead1->val);
        	ListNode* result = temp1;
        	pHead1 = pHead1->next;
        }
        //ListNode* result = NULL;

        while(pHead1 && pHead2)
        {
        	if(pHead1->val > pHead2->val)
        	{
        		ListNode* temp = new ListNode(pHead2->val);
        		result->next = temp;
        		result = result->next;
        		pHead2 = pHead2->next;
        	}
        	else
        	{
        		ListNode* temp = new ListNode(pHead1->val);
        		result->next = temp;
        		result = result->next;
        		pHead1 = pHead1->next;
        	}
        }
        while(pHead1)
        {
        	ListNode* temp = new ListNode(pHead1->val);
    		result->next = temp;
    		result = result->next;
    		pHead1 = pHead1->next;
        }
        while(pHead2)
        {
        	ListNode* temp = new ListNode(pHead2->val);
    		result->next = temp;
    		result = result->next;
    		pHead2 = pHead2->next;
        }
        return result;
    }
};