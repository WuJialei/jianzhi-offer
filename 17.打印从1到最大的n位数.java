import java.util.*;

class Solution {
    
    private String[] strs = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public void dfs (String cur, int n) {
        if (n == 0) {
            int i = 0;
            while (i < cur.length()) {
                if (cur.charAt(i) != '0') {
                    break;
                }
                ++i;
            }
            cur = cur.substring(i, cur.length());
            System.out.println(cur);
            return;
        }
        for (int i = 0; i < strs.length; ++i) {
            dfs(cur + strs[i], n-1);
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        solution.dfs("", 3);
        // char[] ar = {'A','B','C','E','S','F','C','S','A','D','E'};
        // char[] ans = {'A','B','C','C','E','D'};
        // int r = 3;
        // int c = 4;
        // Solution s = new Solution();
        // s.hasPath(ar, r, c, ans);
        
    }

}
