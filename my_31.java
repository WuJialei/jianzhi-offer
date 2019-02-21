import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    
    public boolean IsPopOrder(int [] pushA,int [] popA) {
    	int aLen = pushA.length;
    	int bLen = aLen;
    	int aTemp = 0;
    	Stack<Integer> DataStack = new Stack<Integer>();
    	for(int i = 0; i < aLen; ++i)
    	{	
    		DataStack.push(pushA[i]);
    		while(!DataStack.empty() && DataStack.peek() == popA[aTemp])
    		{
    			aTemp++;
    			DataStack.pop();
    		}
    	}
    	return aTemp == bLen;

    }
}