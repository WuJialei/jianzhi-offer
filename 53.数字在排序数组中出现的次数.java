public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        if (array == null || array.length < 1) {
            return 0;
        }
        int ans = 0;
        int left = 0; 
        int right = array.length - 1;
        int first = 0;
        int last = 0;
        while (left < right) {
            int mid = left + (right - left + 1)/2;
            if (array[mid] > k) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        first = array[left] == k ? left : -1;
        left = 0;
        right = array.length - 1;
        while (left < right) {
            int mid = left + (right - left)/2;
            if (array[mid] < k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        last = array[left] == k ? left : -1;
        ans = first == -1 ? 0: Math.abs(last - first) + 1;
        return ans;
    }
}
