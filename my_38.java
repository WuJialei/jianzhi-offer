import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Solution {
    public ArrayList<String> Permutation(String str) {
    	List<String> result = new ArrayList<String>();
        if(str == null)
        {
        	return null;
        }
        if(str.length() == 0)
        {
 			return (ArrayList)result;
        }
        digui(str.toCharArray(), result, 0);
        Collections.sort(result);
        return (ArrayList)result;
    }

    public void digui(char[] ziFu, List<String> list, int location)
    {
    	if(location == ziFu.length - 1)
    	{
    		if(!list.contains(String.valueOf(ziFu)))
    		{
    			list.add(String.valueOf(ziFu));
                return;
    		}
    	}
        else
        {
            for(int i = location; i < ziFu.length; ++i)
    	    {
                swap(ziFu, i, location);
                digui(ziFu, list, location+1);
                swap(ziFu, i, location);
    	    }
        }
    	
    }
    public void swap(char[] ziFu, int i, int j)
    {
    	char temp = ziFu[i];
    	ziFu[i] = ziFu[j];
    	ziFu[j] = temp;
    }
}