class Solution {
    public int[][] findContinuousSequence(int target) {
        int start = 1;
        int end = 2;
        int sum = 1;
        List<int[]> ans = new ArrayList<>();
        while (start <= (target/2 + 1)) {
            if (sum == target) {
                int[] tmp = new int[end - start];
                int cnt = 0;
                for (int i = start; i < end; ++i) {
                    tmp[cnt++] = i;
                }
                ans.add(tmp);
                sum -= start;
                ++start;
            } else if (sum < target) {
                sum += end;
                ++end;
            } else {
                sum -= start;
                ++start;
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
