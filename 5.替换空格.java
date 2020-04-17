public class Solution {
    public String replaceSpace(StringBuffer str) {
    	if (str == null || str.length() < 1) {
            return "";
        }
        String temp = str.toString();
        StringBuilder sb = new StringBuilder();
        for (char c : temp.toCharArray()) {
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
        /*
        String str1 = str.toString();
        String ans = str1.replaceAll(" ", "%20");
        return ans;
        */
        /*
        String pat = str.toString();
        StringBuilder sb = new StringBuilder("");
        int firstCnt = 0;
        int i = 0;
        for (; i < pat.length(); ++i) {
            if (pat.charAt(i) != ' ') {
                break;
            }
            ++firstCnt;
        }
        while (firstCnt > 0) {
            sb.append("%20");
            --firstCnt;
        }
        int lastCnt = 0;
        int j = pat.length()-1;
        for (; j >= 0; --j) {
            if (pat.charAt(j) != ' ') {
                break;
            }
            ++lastCnt;
        }
        if (j > i) {
            String[] strs = pat.substring(i, j+1).split(" ");
            for (int k= 0; k < strs.length; ++k) {
                sb.append(strs[k]);
                if (k < strs.length - 1) {
                    sb.append("%20");
                }
            }
            while (lastCnt > 0) {
                sb.append("%20");
                --lastCnt;
            }
        }
        
        return sb.toString();
        */
    }
}
