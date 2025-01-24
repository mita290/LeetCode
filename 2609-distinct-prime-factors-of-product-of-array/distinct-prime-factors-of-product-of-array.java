class Solution {
    public int distinctPrimeFactors(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            findPrimeFactors(num, set);
        }
        return set.size();
    }

    public void findPrimeFactors(int n, Set<Integer> set) {
        // Check for factor 2
        while (n % 2 == 0) {
            set.add(2);
            n /= 2;
        }
        // Check for odd factors starting from 3
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                set.add(i);
                n /= i;
            }
        }
        // If n is a prime number greater than 2
        if (n > 2) {
            set.add(n);
        }
    }
}
