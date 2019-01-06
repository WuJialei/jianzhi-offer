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
    ListNode* ReverseList(ListNode* pHead) {

    	if(!pHead)
    	{
    		return NULL;
    	}

    	if(!pHead->next)
    	{
    		return pHead;
    	}

    	ListNode* my_p0 = pHead;
    	ListNode* my_p = pHead;

    	std::vector<int> temp;

    	while(my_p0)
    	{
    		temp.push_back(my_p0->val);
    		my_p0 = my_p0->next;
    	}

    	int i = 0;
    	int j = temp.size() - 1;
    	while(my_p)
    	{
    		my_p->val = temp[j - i];
    		i++;
    		my_p = my_p->next;
    	}

    	return pHead;

    }
};