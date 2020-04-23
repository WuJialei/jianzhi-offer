public class Solution {
    public int NumberOf1(int n) {
        /*
        int cnt = 32;
        int ans = 0;
        while (cnt > 0) {
            if ((n & 1) == 1) {
                ++ans;
            }
            n >>= 1;
            --cnt;
        }
        return ans;
        */
        int ans = 0;
        while (n != 0) {
            ++ans;
            n = n & (n-1);
        }
        return ans;
    }
}
