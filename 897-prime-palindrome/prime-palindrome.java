class Solution {
//     public boolean isPrime(int n) {
//         if (n <= 1) return false;
//         if (n == 2 || n == 3) return true;
//         if (n % 2 == 0 || n % 3 == 0) return false;
//         for (int i = 5; i <= Math.sqrt(n); i = i + 6) {
//             if (n % i == 0 || n % (i + 2) == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public boolean isPal(int x) {
//         int m = 0;
//         int n = x;
//         while (n != 0) {
//             m = (m * 10) + (n % 10);
//             n /= 10;
//         }
//         return x == m;

//     }
//     public int primePalindrome(int n) {
//         if (8 <= n && n <= 11) return 11;
//         for (int i = 1; i < 10000; i++) {
//             String s = Integer.toString(i);
//             String r = new StringBuilder(s).reverse().toString();
//             int j = Integer.parseInt(s + r.substring(1));
//             if (j >= n && isPrime(j)) return j;
//         }
//         return -1;
//     }
    public int primePalindrome(int N) {
        if (8 <= N && N <= 11) return 11;
        for (int x = 1; x < 100000; x++) {
            String s = Integer.toString(x), r = new StringBuilder(s).reverse().toString();
            int y = Integer.parseInt(s + r.substring(1));
            if (y >= N && isPrime(y)) return y;
        }
        return -1;
    }

    public Boolean isPrime(int x) {
        if (x < 2 || x % 2 == 0) return x == 2;
        for (int i = 3; i * i <= x; i += 2)
            if (x % i == 0) return false;
        return true;
    }
}

