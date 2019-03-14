import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
    	int a = -1, b = -1;
    	int len = array.length - 1;
    	int start = 0;
    	while(start < len)
    	{
    		if(array[start] + array[len] == sum)
    		{
    			a = array[start];
    			b = array[len];
    			break;
    		}
    		else if(array[start] + array[len] > sum)
    		{
    			len--;
    		}
    		else
    		{
    			start++;
    		}
    	}
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	if(a==-1 && b==-1)
    	{
    		return result;
    	}
    	else
    	{
    		result.add(a);
	    	result.add(b);
	    	return result;
	    }	
        
    }
}