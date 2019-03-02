import java.util.ArrayList;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
    	ArrayList<Integer> nums = new ArrayList<Integer>();
    	for(int i : numbers)
    	{
    		nums.add(i);
    	}
    	Comparator cpa = new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					String a = o1.toString();
					String b = o2.toString();
					String c = a + b;
					String d = b + a;
					return c.compareTo(d);
				}
		};
		nums.sort(cpa);
		String result = "";
		for(Integer j : nums)
		{
			result = result + j.toString();
		}
		return result;
    }
}