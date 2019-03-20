import java.util.*;
public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(num.length >= size && size >= 1)
        {
        	ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        	int i = 0;
        	for(;i < size; ++i)
        	{
        		while(deque.peekFirst() != null && (num[i] >= num[deque.peekLast()]))
        		{
        			deque.pollLast();
        		}
        		deque.offerLast(i);
        	}
        	for(; i < num.length; ++i)
        	{
        		result.add(num[deque.peekFirst()]);
        		while(deque.peekFirst() != null && num[i] >= num[deque.peekLast()])
        		{
        			deque.pollLast();
        		}
        		if(deque.peekFirst() != null && (i-size)>=deque.peekFirst())
        		{
        			deque.pollFirst();
        		}
        		deque.offerLast(i);
        	}
        	result.add(deque.peekFirst());
        }

        return result;
    }
}