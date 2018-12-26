class Solution {
public:
    

	bool dg(char* juzhen, int r, int c, int row, int col, char* zifuchuan, int k, vector<int> flag1)
	{
		if(k == strlen(zifuchuan))
		{	
			return true;
		}
		int index = r*col + c;
		if(r < 0 || c < 0 || r >= row || c >= col || juzhen[index] != zifuchuan[k] || flag1[index])
		{
			return false;
		}

		flag1[index] = 1;

		if(dg(juzhen, r+1, c, row, col, zifuchuan, k+1, flag1) || dg(juzhen, r-1, c, row, col, zifuchuan, k+1, flag1) || dg(juzhen, r, c+1, row, col, zifuchuan, k+1, flag1) || dg(juzhen, r, c-1, row, col, zifuchuan, k+1, flag1))
		{
			return true;
		}

		flag1[index] = 0;
		return false;

	}

    bool hasPath(char* matrix, int rows, int cols, char* str)
    {
    	std::vector<int> flag1(strlen(matrix), 0);
    	for(int i = 0; i <= rows; ++i)
    	{
    		for(int j = 0; j <= cols; ++j)
    		{
    			if(dg(matrix, i, j, rows, cols, str, 0, flag1))
    			{
    				return true;
    			}
    		}
    	}
    	return false;
    }


};