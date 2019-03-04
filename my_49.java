import java.util.*;
public class Solution {
    public int GetUglyNumber_Solution(int index) {
    	if(index < 1)
    	{
    		return 0;
    	}
    	int[] data = new int[index+5];
    	data[0] = 1;
    	int curIndex = 1;
    	int m2 = 0, m3 = 0, m5 =0;
    	while(curIndex < index)
    	{
    		int minValue = Math.min(data[m2]*2, Math.min(data[m3]*3, data[m5]*5));
    		data[curIndex++] = minValue;
    		if(data[m2]*2 == minValue)
    		{
    			++m2;
    		}
    		if(data[m3]*3 == minValue)
    		{
    			++m3;
    		}
    		if(data[m5]*5 == minValue)
    		{
    			++m5;
    		}
    	}
    	return data[index - 1];
        
    }
}