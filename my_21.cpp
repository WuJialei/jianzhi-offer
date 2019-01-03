class Solution {
public:
    void reOrderArray(vector<int> &array) {
        std::vector<int> before;
        std::vector<int> after;
        for(int i = 0; i < array.size(); ++i)
        {
        	if(array[i] % 2)
        	{
        		before.push_back(array[i]);
        	}
        	else
        	{
        		after.push_back(array[i]);
        	}
        }
        int i = 0;
        int len = array.size();
        while(i < len)
        {
        	int a = 0;
        	int b = 0;
        	while(a < before.size())
        	{
        		array[i++] = before[a++];
        	}
        	while(b < after.size())
        	{
        		array[i++] = after[b++];
        	}
        }
    }
};