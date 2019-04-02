public class Solution {
    public int StrToInt(String str) {
    	int result = 0;
        if(str == null || str.length() == 0)
        {
        	return result;
        }
        else
        {
        	boolean flag = true;
        	int len = str.length();
        	int index = 0;
        	if(str.charAt(index) == '-')
        	{
        		++index;
        		flag = false;
        	}
        	else if(str.charAt(index) == '+')
        	{
        		++index;
        	}
        	for(int i = index; i < len; ++i)
        	{
        		if(str.charAt(i) < '0' || str.charAt(i) > '9')
        		{
        			result = 0;
        			break;
        		}
        		else
        		{
        			int temp = str.charAt(i) - '0';
        			result = result*10 + temp;
        		}
        		if(!flag && i == len-1)
        		{
        			result = 0 - result;
        		}
        	}
        }
        return result;
    }
}