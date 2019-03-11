public class Solution {
   public int GetNumberOfK(int [] array , int k) {
       int len = array.length;
       if(len == 0)
       {
        	return 0;	
       }
       int left = GetLeftK(array, k, 0, len-1);
       int right = GetRightK(array, k, 0, len-1);
       //System.out.println("left"+left);
       //System.out.println("right"+right);
       if(left==-1 && right==-1)
       {
            return 0;
       }
       else
       {
            int num = right - left + 1;
            return num;
       }
       
    }

    public int GetLeftK(int [] array, int k, int l, int r)
    {
    	if(l > r)
    	{
    		return -1;
    	}
        else
        {
            int mid = (l + r)/2;
            if(array[mid] < k)
            {
                return GetLeftK(array, k, mid+1, r);
            }
            else if(array[mid] == k)
            {
                if((mid-1 >= 0) && (array[mid-1]==k))
                {
                    return GetLeftK(array, k, l, mid-1);
                }
                else{
                    //System.out.println("hhhhhh"+mid);
                    return mid;
                }
                
            }
            else
            {
                return GetLeftK(array, k, l, mid-1);
            }

        }    	
        //return -1;
    }

    public int GetRightK(int [] array, int k, int l, int r)
    {
    	if(l > r)
    	{
        	return -1;
    	}
        else
        {
            int mid = (l + r)/2;
            if(array[mid] < k)
            {
                return GetRightK(array, k, mid+1, r);
            }
            else if(array[mid] == k)
            {
                if(mid+1<=r && array[mid+1]==k)
                {
                    return GetRightK(array, k, mid+1, r);
                }
                else
                {
                    //System.out.println("tttttt"+mid);
                    return mid;
                }
                
            }
            else
            {
                return GetRightK(array, k, l, mid-1);
            }
        }
        //return -1;
        
    }

    
}