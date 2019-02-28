import java.util.*;
public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
    	ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < array.length; ++i)
        {
        	if(i==0)
        	{
        		result.add(i, array[i]);
        	}
        	else if(result.get(i-1) <= 0)
        	{
        		result.add(i, array[i]);
        	}
        	else
        	{
        		result.add(i, array[i]+result.get(i-1));
        	}
        }
        int cnt = Integer.MIN_VALUE;
        for(Integer val : result)
        {
        	if(val > cnt)
        	{
        		cnt = val;
        	}
        }
        return cnt;
    }
}