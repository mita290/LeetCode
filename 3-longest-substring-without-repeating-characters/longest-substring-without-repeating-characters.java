class Solution {
    public int lengthOfLongestSubstring(String s) {

        // sliding window
        HashSet<Character> hs = new HashSet<>();
        int l = 0, res = 0;
        for (int r = 0; r < s.length(); r++) {
            while (hs.contains(s.charAt(r))) {
                hs.remove(s.charAt(l));
                l++;
            }
            hs.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
        }
        return res;

        // brute force --> O(n^3)
        // int res = 0;
        // for (int i = 0; i < s.length(); i++) {
        //     for (int j = i; j < s.length(); j++) {
        //         HashSet<Character> hs = new HashSet<>();
        //         for (int k = i; k <= j; k++) {
        //             char ch = s.charAt(k);
        //             if (!hs.add(ch)) {
        //                 break;
        //             }
        //             hs.add(ch);
        //         }
        //         res = Math.max(res, hs.size());
        //     }
        // }
        // return res;
    }
}