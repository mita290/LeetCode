class Solution {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer> al = Arrays.stream(nums).boxed().map(val -> val * val).sorted().collect(Collectors.toCollection(ArrayList::new));
        return al.stream().mapToInt(i -> i).toArray();
    }
}