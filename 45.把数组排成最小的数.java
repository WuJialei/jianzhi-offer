import java.util.*;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
        int n = numbers.length;
        String[] strs = new String[n];
        for (int i = 0; i < n; ++i) {
            strs[i] = "" + numbers[i];
        }
        Arrays.sort(
            strs,
            (a, b) -> {
                return (a+b).compareTo(b+a);
            }
        );
        /*
        Arrays.sort(
            strs,
            (a, b) -> {
                int len = Math.min(a.length(), b.length());
                for (int j = 0; j < len; ++j) {
                    if (a.charAt(j) != b.charAt(j)) {
                        return (int)(a.charAt(j) - b.charAt(j));
                    }
                }
                if (a.length() == b.length()) {
                    return 0;
                } else if (a.length() > b.length()){
                 
                    while (len < a.length() && a.charAt(len) == a.charAt(0)) {
                        ++len;
                    }
                    if (len == a.length()) {
                        return 0;
                    } else {
                        return (int)(a.charAt(len) - a.charAt(0));
                    }
                    
                } else {
                    while (len < b.length() && b.charAt(len) == b.charAt(0)) {
                        ++len;
                    }
                    if (len == b.length()) {
                        return 0;
                    } else {
                        return (int)(b.charAt(0) - b.charAt(len));
                    }
                    
                }
            }
        );
        */
        StringBuilder sb = new StringBuilder("");
        for (String str : strs) {
            sb.append(str);
        }
        return sb.toString();
    }
}
