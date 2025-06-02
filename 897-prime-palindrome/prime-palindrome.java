class Solution {
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i <= Math.sqrt(n); i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    public int primePalindrome(int n) {
        if (8 <= n && n <= 11) return 11;
        for (int i = 1; i < 100000; i++) {
            String s = Integer.toString(i);
            String r = new StringBuilder(s).reverse().toString();
            int j = Integer.parseInt(s + r.substring(1));
            if (j >= n && isPrime(j)) return j;
        }
        return -1;
    }
}