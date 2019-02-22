public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length <= 0)
        {
        	return false;
        }
        int len = sequence.length;
        return Judge(sequence, 0, len);
    }

    public boolean Judge(int [] sequence, int start, int len)
    {
    	if(start >= len-1)
        {
        	return true;
        }
        int RootValue = sequence[len - 1];
        int i = start;
        for(; i < len - 1; ++i)
        {
        	if(sequence[i] > RootValue)
        	{
        		break;
        	}
        }
        int j = i;
        for(; j < len - 1; ++j)
        {
        	if(sequence[j] < RootValue)
        	{
        		return false;
        	}
        }
        boolean LeftFlag = true;
        boolean RightFlag = true;
        if(i > 0)
            LeftFlag = Judge(sequence, start, i);
        if(i < len - 1)
            RightFlag = Judge(sequence, start + i, len - 1 - i);
        return LeftFlag && RightFlag;
    }
}
