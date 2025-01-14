class Solution {
    public int findGCD(int[] nums) {
        int max=Math.max(nums[0], nums[1]);
        int min=Math.min(nums[0], nums[1]);
        for(int i=2;i<=nums.length-1;i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        int ans = 0;
        int i=1;
        while(i<=min){
            if(max%i==0 && min%i==0){
                ans = i;
            }
            i++;
        }
        return ans;
    }

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
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