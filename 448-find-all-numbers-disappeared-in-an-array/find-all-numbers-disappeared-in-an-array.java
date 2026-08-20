class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        ArrayList<Integer> al = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;
            if (nums[idx] > 0) {
                nums[idx] *= -1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                al.add(i + 1);
            }
        }

        return al;

        // not the most optimal
        // HashSet<Integer> hs = new HashSet<>();
        // ArrayList<Integer> al = new ArrayList<>();

        // for (int n : nums) {
        //     hs.add(n);
        // }
        
        // for (int i = 1; i <= nums.length; i++) {
        //     if (!hs.contains(i)) {
        //         al.add(i);
        //     }
        // }        
        // return al;

        // only works for 30/35 testcases
        // HashMap<Integer, Boolean> hm = new HashMap<>();
        // ArrayList<Integer> al = new ArrayList<>();

        // for (int i = 1; i <= nums.length; i++) {
        //     int num = i;
        //     boolean flag = Arrays.stream(nums).anyMatch(x -> x == num);
        //     if (flag) hm.put(i, true);
        //     else hm.put(i, false);
        // }
        // for (int i = 1; i <= nums.length; i++) {
        //     if (hm.get(i)) {
        //         continue;
        //     }
        //     al.add(i);
        // }
        // return al;
    }
}