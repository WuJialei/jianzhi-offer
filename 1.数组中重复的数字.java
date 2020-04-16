import java.util.*;
public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        // 实现空间O(1)
        if (numbers == null || numbers.length < 1 || length < 1) {
            return false;
        }
        Arrays.sort(numbers);
        for (int i = 1; i < length; ++i) {
            if (numbers[i] == numbers[i-1]) {
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
        /*
        // 数组排序之后，如果没有重复，数组索引i对应的就是它的值，一个萝卜一个坑，现在需要找到那个不在自己坑里的萝卜，然后把它放到自己的坑里去，
        // 过程中判断重复
        for (int i = 0; i < length; ++i) {
            while (i != numbers[i]) {
                int j = numbers[i];
                if (numbers[j] == numbers[i]) {
                    duplication[0] = numbers[j];
                    return true;
                } else {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        return false;
        */
    }
}
