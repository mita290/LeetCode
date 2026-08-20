class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        // using prefix sum

        int[] allNums = new int[101];
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            allNums[nums[i]]++;
        }

        for (int i = 1; i < 101; i++) {
            allNums[i] += allNums[i - 1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                res[i] = 0;
            } else {
                res[i] = allNums[nums[i] - 1];
            }
        }

        return res;

        // HashMap<Integer, Integer> hm = new LinkedHashMap<>();
        // ArrayList<Integer> al = new ArrayList<>();
        // for (int i = 0; i < nums.length; i++) {
        //     if (hm.containsKey(nums[i])) {
        //         continue;
        //     } else {
        //         hm.put(nums[i], 0);
        //         for (int j = 0; j < nums.length; j++) {
        //             if (nums[j] < nums[i]) {
        //                 hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        //             }
        //         }
        //     }
        // }
        // // return hm.values().stream().mapToInt(i -> i).toArray(); --> doesn't work if numbers are included multiple times but useful syntax

        // for (int n : nums) {
        //     al.add(hm.get(n));
        // }
        // return al.stream().mapToInt(i -> i).toArray();
        // // alt --> return al.stream().mapToInt(Integer::intValue).toArray();

    }
}