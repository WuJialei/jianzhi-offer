class Solution {
    public String reverseLeftWords(String s, int n) {
        if (s == null || s.length() < n) {
            return "";
        }
        String pre = s.substring(0, n);
        String next = s.substring(n);
        return next + pre;
    }
}
