class Solution {
    public int sumNums(int n) {
        // 循环变递归，把判断出口的条件变布尔值判断并且利用&&的判断规则
        boolean flag = ((n > 0) && ((n += sumNums(n-1)) > 0));
        return n;
    }
}
