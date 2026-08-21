class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> al = new ArrayList<>();
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int x = arr[i + 1] - arr[i];
            if (x <= diff) {
                if (x < diff) {
                    diff = x;
                    al.clear();
                }
                al.add(new ArrayList<Integer>(Arrays.asList(arr[i], arr[i + 1])));
            }
        }
        return al;
    }
}