//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
import java.util.*;
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashMap<Integer, Integer> kv = new HashMap<Integer, Integer>();
        for(int i = 0; i < array.length; ++i)
        {
        	if(kv.containsKey(array[i]))
        	{
        		kv.put(array[i], 2);
        	}
        	else
        	{
        		kv.put(array[i], 1);
        	}
        }
        int a = -1, b = -1;
        for(Map.Entry<Integer, Integer> entry : kv.entrySet())
        {
        	if(entry.getValue() == 1)
        	{
        		if(a == -1)
        		{
        			a = entry.getKey();
        		}
        		else
        		{
        			b = entry.getKey();
        			break;
        		}
        	}
        }
        num1[0] = a;
        num2[0] = b;
    }
}