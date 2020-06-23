class Solution {
    public int cuttingRope(int n) {
        if (n <= 1) {
            return 0;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; ++i) {
            int max = 0;
            for (int j = 1; j <= i/2 + 1; ++j) {
                int left = Math.max(j, dp[j]);
                int right = Math.max(i-j, dp[i-j]);
                max = Math.max(left * right, max);
            }
            dp[i] = max;
        }
        return dp[n];
    }
}
