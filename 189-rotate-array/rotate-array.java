class Solution {
    public void rev(int arr[], int l, int r) {
        while (l < r) {
            int t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++;
            r--;
        }
    }
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k %= n;
        rev(arr, 0, n - 1);
        rev(arr, 0, k - 1);
        rev(arr, k, n - 1);

        // passes only 37/38 testcases
        // int ct = 0, n = nums.length;
        // k %= n;
        // while (ct < k) {
        //     int x = nums[n - 1];
        //     for (int i = n - 1; i >= 1; i--) {
        //         nums[i] = nums[i - 1];
        //     }
        //     nums[0] = x;
        //     ct++;
        // }
    }
}