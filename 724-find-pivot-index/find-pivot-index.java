class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
            if (x == sum) return i;
            x += nums[i];
        }
        return -1;
    }
}