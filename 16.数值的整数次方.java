public class Solution {
    
    public double dfs (double num, int cnt) {
        if (cnt == 0) {
            return 1;
        } else if (cnt == 1) {
            return num;
        }
        double tmp = dfs(num, cnt >> 1);
        tmp *= tmp;
        if ((cnt & 1) == 1) {
            tmp *= num;
        }
        return tmp;
    }
    
    public double Power(double base, int exponent) {
        double ans = 1;
        boolean flag = false;
        if (exponent < 0) {
            flag = true;
            exponent = 0 - exponent;
        }
        /*
        while (exponent > 0) {
            ans *= base;
            --exponent;
        }
        */
        ans = dfs(base, exponent);
        return flag ? 1/ans : ans;
  }
    
}
