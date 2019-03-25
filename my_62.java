public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if(n < 1 || m < 1)
        {
        	return -1;
        }
        int temp = 0;
        for(int i = 2; i <= n; ++i)
        {
        	temp = (temp + m)%i;
        }
        return temp;
    }
}