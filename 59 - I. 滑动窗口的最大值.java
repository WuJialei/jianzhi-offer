class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length < k || k < 1) {
            return new int[]{};
        }
        int len = nums.length;
        int[] ans = new int[len - k + 1];
        PriorityQueue<Integer> queue = new PriorityQueue<>(k, (a, b) -> b-a);
        int i = 0;
        for (; i < k; ++i) {
            queue.offer(nums[i]);
        }
        int j = 0;
        for (; i <= len; ++i) {
            ans[j++] = queue.peek();
            queue.remove(nums[i-k]);
            if (i < len) {
                queue.offer(nums[i]);
            }
            
        }
        return ans;
    }
}
