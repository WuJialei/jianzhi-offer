class Solution {
public:

	int index = 0;

	bool scan_unint(char* str)
	{
		int start = index;
		while((index < strlen(str)) && (str[index] >= '0' && str[index] <= '9'))
		{
			++index;
		}
		return start < index;
	}

	bool scan_int(char* str)
	{
		if((index < strlen(str)) && (str[index] == '+' || str[index] == '-'))
		{
			++index;
		}
		return scan_unint(str);
	}
	
    bool isNumeric(char* string)
    {
        if(!string)
        //if(strlen(string) < 1)
        {
        	return false;
        }

        bool flag = scan_int(string);

        if(index < strlen(string) && string[index] == '.')
        {
        	++index;
        	flag = scan_unint(string) || flag;
        }

        if(index < strlen(string) && (string[index] == 'e' || string[index] == 'E'))
        {
        	++index;
        	flag = flag && scan_int(string);
        }

        return flag && (index == strlen(string));
    }

};