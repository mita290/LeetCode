class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n + 1];
        arr[0] = 0;
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i - 1] + nums[i - 1];
        }
        int ct = 0;
        for (int i = 1; i <= n; i++) {
            ct += (arr[i] == k) ? 1 : 0;
            for (int j = i + 1; j <= n; j++) {
                int x = arr[j] - arr[i];
                if (x == k) {
                    ct++;
                }
            }
        }
        return ct;
    }
}