class Solution {
    public String reverseWords(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        String[] strs = s.trim().split(" ");
        StringBuilder sb = new StringBuilder("");
        for (int i = strs.length - 1; i >= 0; --i) {
            if (strs[i].equals("")) {
                continue;
            }
            sb.append(strs[i].trim());
            if (i != 0) {
                sb.append(" ");
            }
            
        }
        return sb.toString();
    }
}
