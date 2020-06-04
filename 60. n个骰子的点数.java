class Solution {
    public double[] twoSum(int n) {
        // dp[n, s] = dp[n-1, s-1] + dp[n-1, s-2] + ... + dp[n-1, s-6]
        // dp[n, s]表示前n个筛子的值为s的情况数量
        int[][] dp = new int[n+1][6*n+1];
        for (int i = 1; i <= 6; ++i) {
            dp[1][i] = 1;
        }
        for (int i = 2; i <= n; ++i) {
            //int index = i & 1;
            for(int s=i;s<=6*i;s++){
                //求dp[i][s]
                for(int d=1;d<=6;d++){
                    if(s-d<i-1)break;//为0了
                    dp[i][s]+=dp[i-1][s-d];
                }
            }
        }
        double[] ans = new double[5*n + 1];
        double pat = Math.pow(6, n);
        //int index = n & 1;
        int c = 0;
        for (int i = n; i <= 6*n; ++i) {
            ans[c++] = 1.0 * dp[n][i] / pat;
        }
        return ans;
    }
}
