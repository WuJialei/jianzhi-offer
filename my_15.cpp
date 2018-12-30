class Solution {
public:
     int  NumberOf1(int n) {
         /*
         int temp = 1;
         int cnt = 0;
         while(temp)
         {
             if(temp & n)
             {
                 ++cnt;
             }
             temp = temp << 1;
         }
         return cnt;
         */
         int cnt = 0;
         while(n)
         {
             ++cnt;
             n = n & (n-1);
         }
         return cnt;
     }
};