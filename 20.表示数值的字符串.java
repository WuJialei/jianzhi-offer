public class Solution {
    
    public boolean judgePosInt(String str) {
        if (str == null || str.length() < 1) {
            return true;
        }
        int index = 0;
        while (index < str.length()) {
            if (str.charAt(index) < '0' || str.charAt(index) > '9') {
                return false;
            }
            ++index;
        }
        return true;
    }
    
    public boolean judgeInt(String str) {
        if (str == null || str.length() < 1) {
            return false;
        }
        int index = 0;
        if (str.charAt(index) == '-' || str.charAt(index) == '+') {
            ++index;
        }
        return judgePosInt(str.substring(index));
        
    }
    
    public boolean judgeDouble(String str) {
        if (str == null || str.length() < 1) {
            return false;
        }
        int index = str.indexOf('.');
        if (index == -1) {
            return judgeInt(str);
        }
        return judgeInt(str.substring(0, index)) && judgePosInt(str.substring(index+1, str.length()));
    }
    
    public boolean isNumeric(char[] str) {
        if (str == null || str.length < 1) {
            return false;
        }
        // 含指数，则指数前是浮点数，指数后是带符号整数
        // 不含指数，判断是否为浮点数，小数点前为带符号整数，小数点后为正整数
        String pat = new String(str);
        int eIndex = -1;
        if (pat.indexOf('e') != -1 || pat.indexOf('E') != -1) {
            if (pat.indexOf('e') != -1 && pat.indexOf('E') != -1) {
                return false;
            }
            if (pat.indexOf('e') != -1) {
                eIndex = pat.indexOf('e');
            } else {
                eIndex = pat.indexOf('E');
            }
        }
        if (eIndex == -1) {
            return judgeDouble(pat);
        } else {
            return judgeDouble(pat.substring(0, eIndex)) && judgeInt(pat.substring(eIndex+1));
        }
    }
}
