class Solution {
    public boolean helper(String s, int l, int  r) {
        
        if (l >= r) return true;
        char a = s.charAt(l);
        char b = s.charAt(r);
        if (!Character.isLetterOrDigit(a)) return helper(s, l + 1, r);
        else if (!Character.isLetterOrDigit(b)) return helper(s, l, r - 1);
        else if (a != b) return false;
        return helper(s, l + 1, r - 1);
    }
    public boolean isPalindrome(String s) {
        return helper(s.toLowerCase(), 0, s.length() - 1);
    }
}