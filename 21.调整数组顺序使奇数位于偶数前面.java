public class Solution {
    public void reOrderArray(int [] array) {
        if (array == null || array.length < 1) {
            return;
        }
        int len = array.length;
        int[] temp = new int[len];
        int i = 0;
        int j = len - 1;
        for (int num : array) {
            if ((num & 1) == 1) {
                temp[i++] = num;
            } else {
                temp[j--] = num;
            }
        }
        int a = 0;
        for (; a < i; ++a) {
            array[a] = temp[a];
        }
        for (int b = len-1; b > j; --b) {
            array[a++] = temp[b];
        }
        return;
    }
}
