class Solution {
    public int countPrimes(int n) {
        boolean arr[] = new boolean[n + 1];
        int c = 0;
        for (int i = 2; i <= n; i++) {
            arr[i] = true;
        }
        for (int i = 2; i < n; i++) {
            if (arr[i] == true) {
                c++;
                for (int j = i * 2; j < n; j += i) {
                    arr[j] = false;
                }
            }
        }
        return c;
    }
}