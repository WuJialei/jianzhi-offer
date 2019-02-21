import java.util.Stack;

public class Solution {

    
	private Stack<Integer> DataStack = new Stack<Integer>();
	private Stack<Integer> MinStack = new Stack<Integer>();
	private int min = Integer.MAX_VALUE;

    public void push(int node) {
    	DataStack.push(node);
    	if(node < min)
    	{
    		MinStack.push(node);
    		min = MinStack.peek();
    	}
    	else
    	{
    		MinStack.push(min);
    	}
        
    }
    
    public void pop() {
        MinStack.pop();
        DataStack.pop();
        min = MinStack.peek();
    }
    
    public int top() {
        return DataStack.peek();
    }
    
    public int min() {
        return min;
    }
}