import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
    	if(A == null || A.length < 2)
    	{
    		return null;
    	}
    	int len = A.length;
    	int[] B = new int[len];
    	ArrayList<Integer> temp1 = new ArrayList<Integer>();
    	ArrayList<Integer> temp2 = new ArrayList<Integer>();
    	temp1.add(A[0]);
    	temp2.add(len-1, A[len-1]);    	
    	for(int i = 1; i < len; ++i)
    	{
    		temp1.add(A[i] * temp1[i-1]);
    	}
    	for(int j = len - 2; j >= 0; --j)
    	{
    		temp2.add(j, A[j]*temp2[j+1]);
    	}
    	B[0] = temp2[1];
    	B[len-1] = temp1[len-2];
    	for(int z = 1; z < len - 1; ++z)
    	{
    		B[z] = temp1[z-1] * temp2[z+1];
    	}
    	return B;
    }
}