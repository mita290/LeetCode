class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int len = 0;
        int n = nums.length;
        for (int l = 0; l < n; l++) {
            if (nums[l] % 2 != 0 || nums[l] > threshold) {
                continue;
            }
            int r = l;
            while (r < n && nums[r] <= threshold && (r == l || nums[r] % 2 != nums[r - 1] % 2)) {
                r++;
            }
            len = Math.max(len, r - l);
        }
        return len;
    }
}