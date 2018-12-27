class Solution {
public:

	int sum = 0;

	int my_count(int num)
	{
		int t = 0;
		while(num > 0)
		{
			t += num%10;
			num /= 10;
		}
		return t;
	}

	void move(int i, int j, int row, int col, int* flag, int thv)
	{
		int index = i*col + j;
		if(i < 0 || j < 0 || i >= row || j >= col || flag[index])
		{
			return;
		}
		// int sum = 0;
		int temp = 0;
		temp = my_count(i) + my_count(j);
		flag[index] = 1;
		if(temp > thv)
		{
			return;
		}
		sum++;
		move(i-1, j, row, col, flag, thv);
		move(i, j-1, row, col, flag, thv);
		move(i+1, j, row, col, flag, thv);
		move(i, j+1, row, col, flag, thv);
	}

    int movingCount(int threshold, int rows, int cols)
    {
        int cnt = 0;
        int flag[10005];
        memset(flag, 0, sizeof(flag));
        move(0, 0, rows, cols, flag, threshold);
        return sum;
    }
};