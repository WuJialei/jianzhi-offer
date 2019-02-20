import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
       ArrayList<Integer> result = new ArrayList<Integer>();
       int n = matrix.length;
       int m = matrix[0].length;
       int cnt = (Math.min(n, m)-1)/2;
       for(int i = 0; i <= cnt; ++i)
       {
       		for(int j = i; j <= m-1-i; ++j)
       		{
       			result.add(matrix[i][j]);
       		}
       		for(int j = i+1; j <= n-1-i; ++j)
       		{
       			result.add(matrix[j][m-1-i]);
       		}
       		for(int j = m-i-2; (j >= i)&&(n-1-i != i); --j)
       		{
       			result.add(matrix[n-1-i][j]);
       		}
       		for(int j = n-i-2; (j > i)&&(m-1-i != i); --j)
       		{
       			result.add(matrix[j][i]);
       		}
       }
       return result;
    }
}