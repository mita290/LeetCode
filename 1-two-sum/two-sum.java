class Solution {
    public int[] twoSum(int[] nums, int target) {
        // brute force
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             return new int[]{i, j};
        //         }
        //     }
        // }
        // return new int[]{};

        // two pointers - doesn't work for this problem as the array isn't sorted, and if you sort it the indices will change

        // int l = 0, r = nums.length - 1;
        // Arrays.sort(nums);
        // int i = 0;
        // while (l < r) {
        //     int res = nums[l] + nums[r];
        //     if (res == target) return new int[]{l, r};
        //     else if (res < target) ++l;
        //     else --r;
        // }
        // return new int[]{};

        // optimal solution using hashing
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (hm.containsKey(x)) {
                return new int[]{hm.get(x), i};
            }
            hm.put(nums[i], i);
        }
        return new int[]{};
    }
}