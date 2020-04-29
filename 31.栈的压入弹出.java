import java.util.*;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA == null || popA == null) {
            if (pushA == null && popA == null) {
                return true;
            }
            return false;
        }
        int aLen = pushA.length;
        int bLen = popA.length;
        if (aLen != bLen) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int j = 0;
        for (; i < aLen && j < bLen;) {
            if (pushA[i] != popA[j]) {
                stack.push(pushA[i++]);
            } else {
                ++i;
                ++j;
                while (!stack.isEmpty() && j < bLen && stack.peek() == popA[j]) {
                    stack.pop();
                    ++j;
                }
            }
        }
        return !stack.isEmpty() || j < bLen ? false : true;
    }
}
