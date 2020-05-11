public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i = i * 10) {
            int high = n / (i * 10);
            int low = n % i;
            int cur = (n/i)%10;
            if (cur == 0) {
                cnt += high * i;
            } else if (cur == 1) {
                cnt += high * i + low + 1;
            } else {
                cnt += (high + 1) * i;
            }
        }
        return cnt;
        
    }
}
