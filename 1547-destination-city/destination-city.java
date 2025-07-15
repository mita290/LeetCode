class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> source = new HashSet<>();
        Set<String> destin = new HashSet<>();
        for (int i = 0; i < paths.size(); i++) {
            source.add(paths.get(i).get(0));
            destin.add(paths.get(i).get(1));
        }
        destin.removeAll(source);
        return destin.iterator().next();
    }
}