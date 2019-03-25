public class Solution {
    public int Sum_Solution(int n) {
        int cnt = n;
        boolean flag = (cnt > 0) && ((cnt+=Sum_Solution(n-1))>0);
        return cnt;
    }
}