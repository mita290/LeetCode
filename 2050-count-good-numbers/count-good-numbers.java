class Solution {
    int mod = (int) 1e9 + 7;
    public int countGoodNumbers(long n) {
        long first = (n % 2 == 0) ? n / 2 : ((n / 2) + 1);
        long second = n / 2;
        long odd = pow(4, second);
        long even = pow(5, first);
        long res = 1;
        res = (res * even) % mod;
        res = (second != 0) ? (res * odd) : res;
        return (int) (res % mod);
    }

    public long pow(long x, long y) {
        if (y == 0) {
            return 1;
        }
        long temp = pow(x, y / 2);
        if (y % 2 == 0) {
            return (temp * temp) % mod;
        } else {
            return (x * temp * temp) % mod;
        }
    }
}