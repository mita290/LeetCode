class Solution {
    public int fun(int arr[], int l, int h, int x) {
        if (l > h) return -1;
        int m = (l + h) / 2;
        if (arr[m] == x) return m;
        else if (arr[m] > x) return fun(arr, l, m - 1, x);
        else return fun(arr, m + 1, h, x);
    }
    public int search(int[] nums, int target) {
        return fun(nums, 0, nums.length - 1, target);
    }
}