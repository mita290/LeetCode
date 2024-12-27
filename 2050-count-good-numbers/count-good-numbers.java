class Solution {
    int mod = (int) 1e9 + 7;
    public int countGoodNumbers(long n) {
        long first = (n % 2 == 0 ? (n / 2) : (n / 2) + 1);
        long second = n / 2;
        long even = pow(5, first) % mod;
        long odd = pow(4, second);
        long res = 1;
        res = (res * even) % mod;
        res = (second != 0) ? (res * odd) : res;
        return (int)(res % mod);
    }
    public long pow(long x, long y) {
        long temp;
        if (y == 0) {
            return 1; // base case: x ^ 0 = 1
        }
        temp = pow(x, y / 2); // temp = x ^ (y / 2)
        if (y % 2 == 0) {
            return (temp * temp) % mod; // if y is even then (x ^ y) = (x ^ (y / 2)) ^ 2 mod (10 ^ 9 + 7)
        } else {
            return (x * temp * temp) % mod; // if y is odd (2a + 1) then (x ^ y) = (x * (x ^ (y / 2)) ^ 2) mod (10 ^ 9 + 7)
        }
    }
}