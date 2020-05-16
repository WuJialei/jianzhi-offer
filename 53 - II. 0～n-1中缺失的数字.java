class Solution {
    public int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left)/2;
            if (mid == nums[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left] == left ? nums.length : left;
    }
}
