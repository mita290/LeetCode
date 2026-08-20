class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();

        for (int n : nums) {
            hs.add(n);
        }
        
        for (int i = 1; i <= nums.length; i++) {
            if (!hs.contains(i)) {
                al.add(i);
            }
        }        
        return al;

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