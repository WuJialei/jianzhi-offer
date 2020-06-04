class Solution {
    public boolean isStraight(int[] nums) {
        if (nums == null || nums.length != 5) {
            return false;
        }
        Arrays.sort(nums);
        int zeroCnt = 0;
        int addCnt = 0;
        for (int i = 0; i < 5; ++i) {
            if (nums[i] == 0) {
                ++zeroCnt;
            } else {
                if (i == 0 || nums[i-1] == 0) {
                    continue;
                } else if (nums[i] == nums[i-1]) {
                    return false;
                } else {
                    addCnt += nums[i] - nums[i-1] - 1;
                }
            }
        }
        return zeroCnt >= addCnt;
    }
}
