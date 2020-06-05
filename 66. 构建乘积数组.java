class Solution {
    public int[] constructArr(int[] a) {
        if (a == null || a.length < 1) {
            return new int[]{};
        }
        int len = a.length;
        // left[i] 记录i左边的乘积(不含a[i])
        // right[i] 记录i右边的乘积(不含a[i])
        int[] left = new int[len];
        int[] right = new int[len];
        for (int i = 0; i < len; ++i) {
            left[i] = i == 0 ? 1 : left[i-1] * a[i-1];
        }
        for (int i = len-1; i >= 0; --i) {
            right[i] = i == len-1 ? 1 : right[i+1] * a[i+1];
        }
        int[] ans = new int[len];
        for (int i = 0; i < len; ++i) {
            ans[i] = left[i] * right[i];
        }
        return ans;
    }
}
