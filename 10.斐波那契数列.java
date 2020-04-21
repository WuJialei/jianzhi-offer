public class Solution {
    public int Fibonacci(int n) {
        int a = 0;
        int b = 1;
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }
        int cnt = 2;
        while (cnt <= n) {
            int c = b + a;
            a = b;
            b = c;
            ++cnt;
        }
        return b;
    }
}
