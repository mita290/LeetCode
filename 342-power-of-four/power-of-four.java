class Solution {
    public boolean isPowerOfFour(int n) {
        // using recursion
        // if (n <= 0) {
        //     return false;
        // } else if (n == 1) {
        //     return true;
        // }
        // return (n % 4 == 0 && isPowerOfFour(n / 4));

        //bit manipulation
        return (n > 0 && ((n & (n - 1)) == 0) && ((n & 0x55555555) != 0));
    }
}