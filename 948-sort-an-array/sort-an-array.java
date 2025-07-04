class Solution {
    public void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
    public void merge(int[] arr, int l, int m, int r) {
        int p = m + 1 - l;
        int q = r - m;
        int[] a = new int[p];
        int[] b = new int[q];
        for (int i = 0; i < p; i++) {
            a[i] = arr[l + i];
        }
        for (int i = 0; i < q; i++) {
            b[i] = arr[m + 1 + i];
        }
        int i = 0, j = 0, k = l;
        // while (i < p && j < q) {
        //     if (a[i] <= b[j]) {
        //         arr[k++] = a[i++];
        //     } else {
        //         arr[k++] = b[j++];
        //     }
        // }
        // while (i < p) {
        //     arr[k++] = a[i++];
        // }
        // while (j < q) {
        //     arr[k++] = b[j++];
        // }
        
        //lesser lines of code
        while (i < p || j < q) {
            if (j == q || i < p && a[i] < b[j]) {
                arr[k++] = a[i++];
            } else {
                arr[k++] = b[j++];
            }
        } 
    }
    public int[] sortArray(int[] nums) {
        //Arrays.sort(nums);
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
}