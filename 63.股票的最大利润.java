class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 1) {
            return 0;
        }
        int len = prices.length;
        int[] mins = new int[len];
        int[] maxs = new int[len];
        int ans = 0;
        for (int i = 0; i < len; ++i) {
            mins[i] = i == 0 ? prices[i] : Math.min(mins[i-1], prices[i]);
        }
        for (int i = len-1; i >= 0; --i) {
            maxs[i] = i == len-1 ? prices[i] : Math.max(maxs[i+1], prices[i]);
            ans = Math.max(ans, maxs[i] - mins[i]);
        }
        return ans;
    }
}
