class Solution {
    public boolean containsDuplicate(int[] nums) {
        // using sorting
        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length - 1; i++) {
        //     if (nums[i] == nums[i + 1]) {
        //         return true;
        //     }
        // }
        // return false;

        // set approach
        // Set<Integer> ts = new TreeSet<>();
        // for (int n : nums) {
        //     if (ts.contains(n)) {
        //         return true;
        //     }
        //     ts.add(n);
        // }
        // return false;

        // comparing set lengths
        Set<Integer> ts = new TreeSet<>();
        for (int n : nums) {
            ts.add(n);
        }
        return ts.size() != nums.length;

    
    }
}