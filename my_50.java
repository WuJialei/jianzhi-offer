import java.util.*;
public class Solution {
    public int FirstNotRepeatingChar(String str) {
    	System.out.println("test:" + 1);
    	if(str == null || str.length() == 0)
    	{
    		return -1;
    	}
    	char[] aChar = str.toCharArray();
    	HashMap<Character, Integer> data = new HashMap<Character, Integer>();
    	
    	for(int i = 0; i < aChar.length; ++i)
    	{
    		if(!data.containsKey(aChar[i]))
    		{
    			//System.out.println(aChar[i]);
    			data.put(aChar[i], -1*i);
    		}
    		else
    		{
    			data.replace(aChar[i], i);
    		}
    	}
    	
    	
    	for(Character i: aChar)
    	{
    		if(data.get(i) <= 0)
    		{
    			return -1*data.get(i);
    		}
    	}
    	//System.out.println("test:" + 2);
        return -1;
    }

    public static void main(String[] args)
    {
    	Solution solution = new Solution();
    	int a = solution.FirstNotRepeatingChar("google");
    	System.out.println("a:" + a);
    }

}

/*
import java.util.*;
public class Solution {
    public int FirstNotRepeatingChar(String str) {
    	System.out.println("test:" + 1);
    	if(str == null || str.length() == 0)
    	{
    		return -1;
    	}
    	char[] aChar = str.toCharArray();
    	HashMap<Character, Integer> data = new HashMap<Character, Integer>();
    	
    	for(int i = 0; i < aChar.length; ++i)
    	{
    		if(!data.containsKey(aChar[i]))
    		{
    			data.put(aChar[i], -1*i);
    		}
    		else
    		{
    			data.put(aChar[i], i);
    		}
    	}
    	
    	
    	for(Character i: aChar)
    	{
    		if(data.get(i) <= 0)
    		{
    			return -1*data.get(i);
    		}
    	}
        return -1;
    }
}
*/