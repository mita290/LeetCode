class Solution {
    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public int subarrayLCM(int[] nums, int k) {
        int ct = 0;
        for (int i = 0; i < nums.length; i++) {
            int x = 1;
            for (int j = i; j < nums.length && x <= k; j++) {
                x = lcm(x, nums[j]);
                ct += (x == k) ? 1 : 0;
            }
        }
        return ct;
    }
}