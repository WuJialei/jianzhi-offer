public class Solution {

	static long cnt = 0;
    public int InversePairs(int [] array) {
    	Solution sol = new Solution();
        int length = array.length;
        mergeSort(array, 0, length-1);
        long result = (cnt%1000000007);
        return (int)result;
    }

    public static void mergeSort(int[] data, int left, int right)
    {
        if(right == left)
    	{
    		return;
    	}
    	int mid = (right + left)/2;
    	mergeSort(data, left, mid);
    	mergeSort(data, mid+1, right);
    	merge(data, left, mid, right);
    }

    public static void merge(int[] data, int left, int mid, int right)
    {
    	int[] tempData = new int[right - left + 1];
    	int t = 0;
    	int i = left;
    	int j = mid + 1;
    	while(i<=mid && j<=right)
    	{
    		if(data[i] <= data[j])
    		{
    			tempData[t++] = data[i++];
    		}
    		else
    		{
    			cnt += mid - i + 1;
    			tempData[t++] = data[j++];
    		}
    	}
    	while(i<=mid)
    	{
    		tempData[t++] = data[i++];
    	}
    	while(j<=right)
    	{
    		tempData[t++] = data[j++];
    	}
    	for(int s = left, u = 0; s <= right; ++s, ++u)
    	{
    		data[s] = tempData[u];
    	}

    }


}