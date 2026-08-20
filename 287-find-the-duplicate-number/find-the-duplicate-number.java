class Solution {
    public int findDuplicate(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i]) && hm.get(arr[i]) > 0) {
                return arr[i];
            }
            hm.put(arr[i], 1);
        }
        return -1;
    }
}