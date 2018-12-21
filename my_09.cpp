class Solution
{
public:
    void push(int node) {
        stack1.push(node);
    }

    int pop() {
        if(stack2.empty()){
        	while(!stack1.empty()){
                int temp = stack1.top();
        		stack2.push(temp);
                stack1.pop();
        	}
        }
        int temp1 = stack2.top();
        stack2.pop();
        return temp1;
    }

private:
    stack<int> stack1;
    stack<int> stack2;
};