class Solution {
    public int missingNumber(int[] nums) {
        int n1 = 0, n2 = 0;
        for (int i = 0; i < nums.length; i++) {
            n1 ^= nums[i];
        }
        for (int i = 0; i <= nums.length; i++) {
            n2 ^= i;
        }
        return n1 ^ n2;
    }
}