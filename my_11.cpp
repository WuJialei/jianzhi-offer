class Solution {
public:
    int minNumberInRotateArray(vector<int> rotateArray) {
        int left = 0;
        int right = rotateArray.size() - 1;
        while(left <= right)
        {
        	int mid = (left + right)/2;
        	if(rotateArray[mid] < rotateArray[right])
        	{
        		right = mid;
        	}
        	else if(rotateArray[mid] == rotateArray[right])
        	{
        		--right;
        	}
        	else
        	{
        		left = mid + 1;
        	}
        }
        return rotateArray[left];
    }
};
