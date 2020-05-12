import java.lang.reflect.*;
import java.util.*;

public class test {
    
    public int num2str(char[] arrays) {
        if (arrays == null || arrays.length < 1) {
            return 0;
        }
        int len = arrays.length;
        int[] dp = new int[len+1];
        dp[0] = 0;
        dp[1] = 1;
        // 倒着来
        // if num[i,i+1] in [0, 26), dp[i] = dp[i-1] + dp[i-2] 
        // else dp[i] = dp[i-1]
        for (int j = len -2; j >= 0; --j) {
            dp[len-j] = dp[len-1-j];
            int val = ((int)(arrays[j] - '0')) * 10 + ((int) (arrays[j+1] - '0'));
            if (val >= 0 && val < 26) {
                dp[len-j] += dp[len-2-j];
            }
        }
        return dp[len];
    }
 
    public static void main(String[] args) {
        test demo=new test();
        String str = "678958";
        int ans = demo.num2str(str.toCharArray());
        System.out.println(ans);
    }
}
