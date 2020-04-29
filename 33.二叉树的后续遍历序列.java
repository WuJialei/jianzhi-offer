import java.util.*;
public class Solution {
    
    private int[] inOrder;
    private int[] lastOrder;
    
    public boolean dfs(int a, int b, int c, int d) {
        if (a > b || c > d) {
            if (a > b && c > d) {
                return true;
            }
            return false;
        }
        int index = -1;
        for (int i = a; i <= b; ++i) {
            if (lastOrder[d] == inOrder[i]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        }
        return dfs(a, index-1, c, c+index-a-1) && dfs(index+1, b, c+index-a, d-1);
    }
    
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length < 1) {
            return false;
        }
        int len = sequence.length;
        lastOrder = sequence;
        inOrder = new int[len];
        for (int i = 0; i < len; ++i) {
            inOrder[i] = sequence[i];
        }
        Arrays.sort(inOrder);
        return dfs(0, len-1, 0, len-1);
    }
}
