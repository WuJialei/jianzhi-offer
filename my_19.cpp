class Solution {
public:

	bool my_match(char* str, char* pattern)
	{
		if((*str == '\0') && (*pattern == '\0'))
		{
			return true;
		}
		if((*str != '\0') && (*pattern == '\0'))
		{
			return false;
		}
		if(*(pattern+1) == '*')
		{
			if((*str == *pattern) || (*str != '\0' && *pattern == '.') )
			{
				return my_match(str+1, pattern) || my_match(str, pattern+2);
			}
			else
			{
				return my_match(str, pattern+2);
			}
		}
		else
		{
			if((*str == *pattern) || (*str != '\0' && *pattern == '.') )
			{
				return my_match(str+1, pattern+1);
			}
			else
			{
				return false;
			}
		}
	
	}

    bool match(char* str, char* pattern)
    {
    	if(str == NULL || pattern == NULL)
    	{
    		return false;
    	}
    	return my_match(str, pattern);
    }
};