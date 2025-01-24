class Solution {
    public int distinctPrimeFactors(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            Integer[] arr = findPrimeFactors(nums[i]);
            for (Integer x : arr) {
                set.add(x);
            }
        }
        return set.size();
    }
    public Integer[] findPrimeFactors(int n) {
        ArrayList<Integer> al = new ArrayList<>();
        while (n % 2 == 0) {
            al.add(2);
            n /= 2;
        }
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                al.add(i);
                n /= i;
            }
        }
        if (n > 2) {
            al.add(n);
        }
        Integer[] arr = new Integer[al.size()];
        arr = al.toArray(arr);
        return arr;
    }
}  
