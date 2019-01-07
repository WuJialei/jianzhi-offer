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

	ListNode* MeetNode(ListNode* pHead)
	{
		if(pHead == nullptr)
		{
			return nullptr;
		}
		ListNode* slow = pHead->next;
		if(slow == nullptr)
		{
			return nullptr;
		}
		ListNode* fast = slow->next;
		while(fast != nullptr && slow != nullptr)
		{
			if(fast == slow)
			{
				return fast;
			}
			slow = slow->next;
			fast = fast->next;
			if(fast != nullptr)
			{
				fast = fast->next;
			}
		}
		return nullptr;

	}

    ListNode* EntryNodeOfLoop(ListNode* pHead)
    {
    	if(pHead == nullptr)
    	{
    		return nullptr;
    	}
    	ListNode* meet_node = MeetNode(pHead);
    	if(meet_node == nullptr)
    	{
    		return nullptr;
    	}
    	int circle_cnt = 1;
    	ListNode* temp = meet_node;
    	while(temp->next != meet_node)
    	{
    		++circle_cnt;
    		temp = temp->next;
    	}
    	ListNode* a = pHead;
    	ListNode* b = pHead;
    	//for(int i = 0; i < circle_cnt; i++)
    	while(circle_cnt--)
    	{
    		a = a->next;
    	}
    	while(a != b)
    	{
    		a = a->next;
    		b = b->next;
    	}
    	return a;
    }
};