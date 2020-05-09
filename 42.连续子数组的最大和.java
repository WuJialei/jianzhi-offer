import java.util.*;
public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length < 1) {
            return 0;
        }
        int pre = array[0];
        int cur = array[0];
        int ans = cur;
        for (int i = 1; i < array.length; ++i) {
            cur = pre <= 0 ? array[i] : pre + array[i];
            ans = Math.max(ans, cur);
            pre = cur;
        }
        return ans;
    }
}
