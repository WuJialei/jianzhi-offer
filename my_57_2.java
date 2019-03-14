import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
       ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
       int start = 1;
       int end = 2;
       int curSum = start + end;
       int mid  = (1+sum)/2;
       if(sum < 3)
       {
       		return result;
       }
       else{
       		while(start < mid)
       		{
       			if(curSum == sum)
       			{
       				ArrayList<Integer> temp = getArray(start, end);
       				result.add(temp);
       			}
       			while(curSum > sum && start < mid)
       			{
       				curSum -= start;
       				start++;
       				if(curSum == sum)
       				{
       					ArrayList<Integer> temp = getArray(start, end);
       					result.add(temp);
       				}
       			}
       			end++;
       			curSum += end;
       		}
           return result;
       }
    }

    public ArrayList<Integer> getArray(int a, int b)
    {
    	ArrayList<Integer> temp = new ArrayList<Integer>();
    	for(int i = a; i <= b; i++)
    	{
    		temp.add(i);
    	}
    	return temp;
    }

}