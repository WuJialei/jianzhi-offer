public class Solution {
    public String LeftRotateString(String str,int n) {
        if(str == "")
        {
        	return str;
        }
        int len = str.length();
        if(n >= len)
        {
        	return str;
        }
        char[] temp = str.toCharArray();
        char[] sum = new char[len]; 
        int i = 0;
        for(int j = n; j < len; ++j, ++i)
        {
        	sum[i] = temp[j];
        }
        for(int k = 0; k < n; ++k, ++i)
        {
        	sum[i] = temp[k];
        }
        String result = new String(sum);
        return result;
    }
}