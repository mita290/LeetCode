class Solution {
    String str="a";
    public char kthCharacter(int k) {
        int n = str.length();
        if (k <= n) {
            return str.charAt(k - 1);
        }
        for (int i = 0; i < n; i++) {
            str += (char)(str.charAt(i) + 1);
        }
        return kthCharacter(k);
    }
}