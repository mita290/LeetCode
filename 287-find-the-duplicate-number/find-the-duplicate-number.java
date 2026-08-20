class Solution {
    public int findDuplicate(int[] arr) {

        // marking visited values within an array
        for (int n : arr) {
            int x = Math.abs(n);
            if (arr[x] < 0) {
                return x;
            }
            arr[x] = -arr[x];
        }
        return -1;

        //using hashset
        // HashSet<Integer> set = new HashSet<>();
        // int len = arr.length;
        // for (int i = 0; i < len; i++) {
        //     if (!set.add(arr[i])) {
        //         return arr[i];
        //     }
        // }
        // return -1

        // using hashmap
        // HashMap<Integer, Integer> hm = new HashMap<>();
        // for (int i = 0; i < arr.length; i++) {
        //     if (hm.containsKey(arr[i]) && hm.get(arr[i]) > 0) {
        //         return arr[i];
        //     }
        //     hm.put(arr[i], 1);
        // }
        // return -1;
    }
}