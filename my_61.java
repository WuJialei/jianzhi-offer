import java.util.*;
public class Solution {
    public boolean isContinuous(int [] numbers) {
    	boolean flag = false;
    	if(numbers == null || numbers.length < 1)
    	{
    		return flag;
    	}
    	Arrays.sort(numbers);
    	int cnt0 = 0;
    	int cnt1 = 0;
    	for(int i : numbers)
    	{
    		if(i == 0)
    		{
    			++cnt0;
    		}
    	}
    	int left = cnt0;
    	int right = left+1;
    	while(left < right && left < numbers.length - 1)
    	{
    		if(numbers[right] == numbers[left])
            {
                return false;
            }
            if(numbers[right] > numbers[left]+1)
    		{
    			cnt1 += numbers[right] - numbers[left] - 1;
    		}
            left++;
            right++;
    	}
    	return (cnt0 >= cnt1)? true: false;
    }
}