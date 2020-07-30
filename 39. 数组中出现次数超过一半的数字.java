class Solution {
    public int majorityElement(int[] nums) {
        // 摩尔投票
        int votes = 0;
        int x = 0;
        for (int num : nums) {
            if (votes == 0) {
                x = num;
                ++votes;
            } else {
                votes += (x==num) ? 1 : -1;
            }
        }
        return x;
    }
}
