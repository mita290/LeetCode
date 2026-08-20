class Solution {
    public void rev(int[] arr, int l, int r) {
        while (l < r) {
            // can sometimes cause problems -->  if l == r then the result would be 0
            // arr[l] ^= arr[r];
            // arr[r] ^= arr[l];
            // arr[l++] ^= arr[r--];
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
    }
}