class Solution {
    public int longestMountain(int[] arr) {
        // in the optimal approach, we identify the peak first and extend the left and right edges
        // we repeat this process for all elements in the array
        
        int n = arr.length;
        int res = 0;

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] <= arr[i - 1] || arr[i] <= arr[i + 1]) {
                continue;
            }
            int left = i, right = i;
            while (left > 0 && arr[left] > arr[left - 1]) {
                left--;
            }
            while (right < n - 1 && arr[right] > arr[right + 1]) {
                right++;
            }
            res = Math.max(right - left + 1,  res);
        }
        return res;
        
        // we can optimise this even further as shown above, by making sure we don't process the same mountains again and again
        /*
        int n = arr.length;
        int res = 0;
        int i = 1;

        while (i < n - 1) {

            if (arr[i] <= arr[i - 1] || arr[i] <= arr[i + 1]) {
                i++;
                continue;
            }

            int left = i, right = i;

            while (left > 0 && arr[left] > arr[left - 1]) {
                left--;
            }
            while (right < n - 1 && arr[right] > arr[right + 1]) {
                right++;
            }

            res = Math.max(right - left + 1,  res);
            i = right;

        }
        return res;
        */

        /* In this approach we try to solve from the outward side to the inside but that's not reliable
        the better idea would be to check for this order strictly increasing >> peak >> strictly decreasing
        int n = arr.length, res = 0;
        int left = 0, right = n - 1;
        
        while (left < right) {
            if ((left == right) || (right - left < 3)) break;

            if (arr[left] > arr[left + 1]) {
                left++;
                System.out.println("Left value: " + arr[left]);
            }
            if (arr[right] > arr[right - 1]) {
                right--;
                System.out.println("Right value: " + arr[right]);
            }
            int l = left, r = right;
            while (arr[l] < arr[l + 1] && arr[r] < arr[r - 1] && l != r) {
                l++;
                r--;
            }
            System.out.println("Final value of l and r: " + arr[l] + " " + arr[r]);
            if (l == r) {
                res = Math.max(right - left + 1, res);
                break;
            } else {
                left++;
                right--;
            }
        }
        return res; */
    }
}