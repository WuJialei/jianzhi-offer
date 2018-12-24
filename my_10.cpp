class Solution {
public:
    int Fibonacci(int n) {
        int bef = 0, cur = 1;
        for(int i = 1; i <= n; i++){
            //保留好上一个
            int temp = cur;
            cur = cur + bef;
            bef = temp;
        }
        return bef;
    }
};