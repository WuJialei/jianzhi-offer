public class Solution {
    public int cutRope(int target) {
        int len = target + 1;
        int[] dp = new int[len];
        if (target < 2) {
            return 0;
        } else if (target == 2) {
            return 1;
        } else if (target == 3) {
            return 2;
        }
        // dp[i]表示必须剪一下
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 2;
        for (int i = 4; i <= target; ++i) {
            int max = 0;
            for (int j = 1; j <= i/2 + 1; ++j) {
                max = Math.max(max, dp[j] * dp[i-j]);
                max = Math.max(max, j * (i-j));
            }
            dp[i] = max;
        }
        return dp[target];
    }
}
