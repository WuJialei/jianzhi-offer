import java.util.Map;
import java.util.HashMap;
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer, Integer> data = new HashMap<Integer, Integer>();
        /*
        for(int i = 0; i < array.length; ++i)
        {
        	data.put(array[i], data.getOrDefault(array[i], 0)+1);
        }
        */
        for(int temp : array)
        {
        	data.put(temp, data.getOrDefault(temp, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : data.entrySet())
        {
        	if(entry.getValue() > array.length/2)
        	{
        		return entry.getKey();
        	}
        }
        return 0;
    }
}