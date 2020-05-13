public class Solution {
  public int dfs (int[][] array) {
        if (array == null || array.length < 1 || array[0].length < 1) {
            return 0;
        }
        int m = array.length;
        int n = array[0].length;
        int[][] dp = new int[2][n+1];
        for (int i = 1; i <= m; ++i) {
            int index = i & 1;
            for (int j = 1; j <= n; ++j) {
                dp[index][j] = Math.max(dp[1-index][j], dp[index][j-1]) + array[i-1][j-1];
            }
        }
        return dp[1&m][n];
    }
}
