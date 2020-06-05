class Solution {

    public boolean judgeNumChar(char c) {
        if ((c >= '0') && (c <= '9')) {
            return true;
        } else {
            return false;
        }
    }

    public int strToInt(String str) {
        if (str == null || str.length() < 1) {
            return 0;
        }
        str = str.trim();
        long flag = 1;
        long val = 0;
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) != '-' && str.charAt(i) != '+' && !judgeNumChar(str.charAt(i))) {
                return 0;
            } else {
                if (str.charAt(i) == '-') {
                    flag = -1;
                    ++i;
                } else if (str.charAt(i) == '+') {
                    ++i;
                }
                while ((i < str.length()) && judgeNumChar(str.charAt(i))) {
                    val = val * 10 + (str.charAt(i) - '0');
                    if (val > Integer.MAX_VALUE) {
                        return flag == 1 ? Integer.MAX_VALUE: Integer.MIN_VALUE;
                    }
                    ++i;
                }
                break;
            }            
        }
        val = val * flag;
        return (int)val;
        
    }
}
