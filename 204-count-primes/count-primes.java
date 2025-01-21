class Solution {
    public int countPrimes(int n) {
        if (n < 3) {
            return 0;
        }
        boolean[] prime = new boolean[n];
        Arrays.fill(prime, true);
        int res = n / 2;
        for (int i = 3; i * i < n; i += 2) {
            if (prime[i] == true) {
                int x = i * 2;
                for (int j = i * i; j < n; j += x) {
                    if (prime[j] == true) {
                        prime[j] = false;
                        res--;
                    }
                }
            }
        }
        return res;
        // sieve of eratosthenes
        // boolean arr[] = new boolean[n + 1];
        // int c = 0;
        // for (int i = 2; i <= n; i++) {
        //     arr[i] = true;
        // }
        // for (int i = 2; i < n; i++) {
        //     if (arr[i] == true) {
        //         c++;
        //         for (int j = i * 2; j < n; j += i) {
        //             arr[j] = false;
        //         }
        //     }
        // }
        // return c;
    }
}