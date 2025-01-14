class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return gcd(nums[0], nums[nums.length - 1]);
    }
    public int gcd(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return b;
        } else if (a < b) {
            return gcd(a, b - a);
        } else {
            return gcd(a - b, b);
        }
    }
}