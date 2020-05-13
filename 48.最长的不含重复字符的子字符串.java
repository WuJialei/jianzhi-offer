public class Solution {
    public int maxLen (String str) {
        if (str == null || str.length() < 1) {
            return 0;
        }
        // dp[i] = dp[i-1] + 1 , if i位置字母之前没出现过或者出现但和最近出现的位置差大于dp[i-1]
        // dp[i] = (i - 1 - lastIndex) + 1 , if i位置字母最近出现的字母在dp[i-1]的范围内
        int[] index = new int[26];
        Arrays.fill(index, -1);
        int len = str.length();
        int[] dp = new int[len];
        dp[0] = 1;
        index[(int)(str.charAt(0) - 'a')] = 0;
        int ans = 1;
        for (int i = 1; i < len; ++i) {
            int cur2num = (int)(str.charAt(i) - 'a');
            if (index[cur2num] == -1) {
                dp[i] = dp[i-1] + 1;
            } else {
                int lastIndex = index[cur2num];
                dp[i] = (i-lastIndex) <= dp[i-1] ? i-lastIndex : dp[i-1] + 1;
            }
            index[cur2num] = i;
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}
