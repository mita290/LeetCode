class Solution {
    public List<List<Integer>> generate(int n) {
        return fun(n);
    }
    public List<List<Integer>>fun(int n) {
        if (n == 0) return new ArrayList<>();
        else if (n == 1) {
            List<List<Integer>> res = new ArrayList<>();
            res.add(Arrays.asList(1));
            return res;
        }
        List<List<Integer>> prev = fun(n - 1);
        List<Integer> newrow = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            newrow.add(1);
        }
        for  (int i = 1; i < n - 1; i++) {
            newrow.set(i, prev.get(n - 2).get(i - 1) + prev.get(n - 2).get(i));
        }
        prev.add(newrow);
        return prev;
    }
}