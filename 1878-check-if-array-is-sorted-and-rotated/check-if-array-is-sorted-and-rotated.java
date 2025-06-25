class Solution {
    public boolean check(int[] arr) {
        int ct = 0, n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n] && ++ct > 1) return false;
        }
        return ct <= 1;
        // string comparison method
        // int n = arr.length;
        // int[] nums = new int[n];
        // for (int i = 0; i < n; i++) {
        //     nums[i] = arr[i];
        // }
        // Arrays.sort(nums);
        // String str = Arrays.toString(nums);
        // int ct = 0;
        // while (ct < n) {
        //     if (Arrays.toString(arr).equals(str)) {
        //         return true;
        //     } else {
        //         ct++;
        //         int x = arr[0];
        //         for (int i = 1; i < n; i++) {
        //             arr[i - 1] = arr[i];
        //         }
        //         arr[n - 1] = x;
        //     }
        // }
        // return false;
    }
}