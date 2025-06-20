class Solution {
    public int hammingWeight(int n) {
        int ct = 0;
        while (n != 0) {
            ct += (n % 2 == 0) ? 0 : 1;
            n /= 2;
        }
        return ct;
    }
}