class Solution {
    public int first(int arr[], int l, int h, int x) {
        if (l > h) return -1;
        int m = (l + h) / 2;
        if (arr[m] > x) return first(arr, l, m - 1, x);
        else if (arr[m] < x) return first(arr, m + 1, h, x);
        else {
            if (m == 0 || arr[m - 1] != x) return m;
            else return first(arr, l, m - 1, x);
        }
    }
    public int last(int arr[], int l, int h, int x) {
        if (l > h) return -1;
        int m = (l + h) / 2;
        if (arr[m] > x) return last(arr, l, m - 1, x);
        else if (arr[m] < x) return last(arr, m + 1, h, x);
        else {
            if (m == arr.length - 1 || arr[m + 1] != x) return m;
            else return last(arr, m + 1, h, x);
        }
    }
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = first(nums, 0, nums.length - 1, target);
        res[1] = last(nums, 0, nums.length - 1, target);
        return res;
    }
}