import java.util.*;
public class Solution {
    
    public int min(int a, int b, int c) {
        int ret = a;
        ret = Math.min(ret, b);
        ret = Math.min(ret, c);
        return ret;
    }
    
    public int GetUglyNumber_Solution(int index) {
        // 丑数都是由排在前面的丑数✖️2、3、5得到的
        // 也就是是说每一个丑数都要✖️2、3、5，从2、3、5角度考虑乘以到第几个丑数了
        if (index < 1) {
            return 0;
        }
        int[] array = new int[index];
        array[0] = 1;
        // ✖️2的从索引为0的丑数开始
        int m2 = 0;
        int m3 = 0;
        int m5 = 0;
        int next = 1;
        while (next < index) {
            int tmp = min(array[m2] * 2, array[m3] * 3, array[m5] * 5);
            array[next++] = tmp;
            while (array[m2] * 2 <= tmp) {
                ++m2;
            }
            while (array[m3] * 3 <= tmp) {
                ++m3;
            }
            while (array[m5] * 5 <= tmp) {
                ++m5;
            }
        }
        return array[index-1];
    }
}
