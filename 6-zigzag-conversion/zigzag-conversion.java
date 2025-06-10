class Solution {
    public String convert(String s, int r) {
        if (s == null || s.length() == 0 || r <= 1 || r >= s.length()) return s;
        ArrayList<StringBuilder> al = new ArrayList<>();
        for (int i = 0; i < r; i++) {
            al.add(new StringBuilder(""));
        }
        int ct = 0;
        boolean flag = false;
        for (char ch : s.toCharArray()) {
            al.get(ct).append(ch);
            if (ct == 0 || ct == r - 1) {
                flag = !flag;
            }
            ct += (flag) ? 1 : -1;
        }
        String str = "";
        for (StringBuilder sb : al) {
            str += sb.toString();
        }
        return str;
    }
}