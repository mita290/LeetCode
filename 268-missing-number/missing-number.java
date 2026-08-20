class Solution {
    public int missingNumber(int[] nums) {
        int x = 0, y = 0;
        for (int i = 0; i < nums.length; i++) {
            x ^= nums[i];
            y ^= i;
        }
        y ^= nums.length;
        return x ^ y;
    }
}