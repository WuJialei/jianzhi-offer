import java.util.ArrayList;
import java.util.*;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
    	if(input.length == 0 || input.length < k)
    	{
    		return new ArrayList<Integer>();
    	}
    	else
    	{            
    	    ArrayList<Integer> result = new ArrayList<Integer>();
    	    for(int i : input)
    	    {
    	    	result.add(i);
    	    }
    		Comparator c = new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					if((int)o1 > (int)o2)
						return 1;
					else 
						return -1;
				}
			};
			result.sort(c);
			ArrayList<Integer> temp = new ArrayList<Integer>(result.subList(0, k));
			return temp;
    	}
    }
}