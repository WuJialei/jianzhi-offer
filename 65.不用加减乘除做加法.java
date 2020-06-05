class Solution {
    public int add(int a, int b) {
        // 两个数相加，可以分解为原位相加值+进位相加值(需要左移1位)
        if (b == 0) {
            return a;
        }
        return add(a^b, (a & b) << 1);
    }
}
