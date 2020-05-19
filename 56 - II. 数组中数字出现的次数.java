class Solution {
    public int singleNumber(int[] nums) {
        int[] bits = new int[32];
        // 一个数出现三次，则对应位1出现的次数也是3的倍数
        // 寻找位数上1出现次数不为3的倍数，该位即为唯一出现次数的位数
        for (int num : nums) {
            int cnt = 32;
            while (cnt > 0) {
                if ((num & 1) == 1) {
                    ++bits[cnt-1];
                }
                num >>= 1;
                --cnt;
            }  
        }
        int ans = 0;
        for (int bit : bits) {
            ans <<= 1;
            if (bit % 3 == 1) {
                ans += 1;
            }
        }
        return ans;
    }
}
