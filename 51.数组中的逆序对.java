public class Solution {
    
    private long cnt;
    private int[] array;
    
    public void mergeSort(int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left)/2;
        mergeSort(left, mid);
        mergeSort(mid + 1, right);
        merge(left, mid, right);
    }
    
    public void merge(int left, int mid, int right) {
        int[] tmp = new int[right - left + 1];
        int k = 0;
        int i = left;
        int j = mid + 1;
        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                tmp[k++] = array[i++];
            } else {
                cnt += mid - i + 1;
                tmp[k++] = array[j++];
            }
        }
        while (i <= mid) {
            tmp[k++] = array[i++];
        }
        while (j <= right) {
            tmp[k++] = array[j++];
        }
        k = 0; 
        i = left;
        while (i <= right) {
            array[i++] = tmp[k++];
        }
    }
    
    public int InversePairs(int [] array) {
        if (array == null || array.length < 1) {
            return 0;
        }
        cnt = 0;
        this.array = array;
        mergeSort(0, array.length - 1);
        cnt = cnt % 1000000007;
        return ((int) cnt);
    }
}
