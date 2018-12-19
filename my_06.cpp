/**
*  struct ListNode {
*        int val;
*        struct ListNode *next;
*        ListNode(int x) :
*              val(x), next(NULL) {
*        }
*  };
*/
class Solution {
public:
	// solution one: std::vector<int> v; 
    vector<int> printListFromTailToHead(ListNode* head) { 
    	/* 		
  		if(head != NULL){
  			if(head->next != NULL){
  				v = printListFromTailToHead(head->next);
  			}
  			v.push_back(head->val);
  		}   
  		return v; 
  		*/

  		//solution two:
  		/*
  		std::vector<int> v1;
  		std::vector<int> v2;
  		if(head != NULL){
  			int temp = head->val;
  			v1.push_back(temp);
  			while(head->next != NULL){
  				temp = head->next->val;
  				v1.push_back(temp);
  				head = head->next;
  			}
  		}
  		for(int i = v1.size() - 1; i >= 0; i--){
  			v2.push_back(v1[i]);
  		}
  		return v2;
  		*/

  		//solutiom three:
  		stack<int> v_start;
  		std::vector<int> v_end;
  		while(head != NULL){
  			//v_start.push_back(head->val);
  			v_start.push(head->val);
  			head = head->next;
  		}
  		while(!v_start.empty()){
  			int temp = v_start.top();
  			v_end.push_back(temp);
  			v_start.pop();
  		}
  		return v_end;

    }
};