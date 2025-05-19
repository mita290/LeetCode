class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];
        int i = 2, gcd = 1;
        while (min != 0 && i <= min) {
            if (max % i == 0 && min % i == 0) {
                gcd *= i;
                max /= i;
                min /= i;
            } else {
                i++;
            }
        }
        return gcd;
    }

    // different implementations of euclid's method
    // public int gcd(int a, int b) {
    //     if (b == 0) {
    //         return a;
    //     }
    //     return gcd(b, a % b);
    // }
    // public int gcd(int a, int b) {
    //     if (a == 0) {
    //         return b;
    //     } else if (b == 0) {
    //         return b;
    //     } else if (a < b) {
    //         return gcd(a, b - a);
    //     } else {
    //         return gcd(a - b, b);
    //     }
    // }
}