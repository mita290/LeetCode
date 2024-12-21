class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for (int i = 0; i < n - m + 1; i++) {
            int t = i;
            for (int j = 0; j < m; j++) {
                if (haystack.charAt(t) != needle.charAt(j)) {
                    break;
                } else if (j == m - 1) {
                    return i;
                } else {
                    t++;
                }
            }
        }
        return -1;
    }
}