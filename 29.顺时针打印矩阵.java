import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return list;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int cnt = 1;
        int iS = 0;
        int iE = m-1;
        int jS = 0;
        int jE = n-1;
        int i = 0, j = 0;
        while (cnt <= m*n) {
            for (i = iS, j = jS; j <= jE && cnt <= m*n; ++j) {
                list.add(matrix[i][j]);
                ++cnt;
            }
            ++iS;
            for (i = iS, j = jE; i <= iE && cnt <= m*n; ++i) {
                list.add(matrix[i][j]);
                ++cnt;
            }
            --jE;
            for (i = iE, j = jE; j >= jS && cnt <= m*n; --j) {
                list.add(matrix[i][j]);
                ++cnt;
            }
            --iE;
            for (i = iE, j = jS; i >= iS && cnt <= m*n; --i) {
                list.add(matrix[i][j]);
                ++cnt;
            }
            ++jS;
        }
        return list;
    }
}
