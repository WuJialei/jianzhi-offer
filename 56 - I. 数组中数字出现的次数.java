class Solution {
    public int[] singleNumbers(int[] nums) {
        if (nums == null || nums.length < 2) {
            return null;
        }
        int tmp = 0;
        // 找出数组里唯一出现一次的两个数的异或值
        for (int num : nums) {
            tmp ^= num;
        }
        int cnt = 1;
        while ((tmp & 1) != 1) {
            tmp >>= 1;
            cnt <<= 1;
        }
        int a = 0;
        int b = 0;
        // 两个数不相同，一定存在某一位相异的情况，找出该位将数组分类
        for (int num : nums) {
            if ((num & cnt) == cnt) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        int[] ans = new int[2];
        ans[0] = a;
        ans[1] = b;
        return ans;
    }
}
