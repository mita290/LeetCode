class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer, Integer> hm = new LinkedHashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                continue;
            } else {
                hm.put(nums[i], 0);
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] < nums[i]) {
                        hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
                    }
                }
            }
        }
        // return hm.values().stream().mapToInt(i -> i).toArray(); --> doesn't work if numbers are included multiple times but useful syntax

        for (int n : nums) {
            al.add(hm.get(n));
        }
        return al.stream().mapToInt(i -> i).toArray();
        // alt --> return al.stream().mapToInt(Integer::intValue).toArray();

    }
}