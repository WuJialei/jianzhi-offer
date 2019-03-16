import java.util.*;
public class Solution {
	public static char [] chars;
    public String ReverseSentence(String str) {
    	if(str == "")
    	{
    		return str;
    	}
        chars = str.toCharArray();
        int len  = chars.length - 1;
        reverse(chars, 0, len);
        for(int cur = 0, next = 0; cur <= len && next <= len;)
        {
        	while(cur <= len && chars[cur] == ' ')
        	{
        		cur++;
        	}
        	next = cur;
        	while(next <= len && chars[next] != ' ')
        	{
        		next++;
        	}
        	reverse(chars, cur, next-1);
        	cur = next;
        }
        String result = new String(chars);
        return result;
    }

    public void reverse(char [] data, int start, int end)
    {
    	while(start < end)
    	{
    		char temp = data[start];
    		data[start] = data[end];
    		data[end] = temp;
    		start++;
    		end--;
    	}

    }
}