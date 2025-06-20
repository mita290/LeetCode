class Solution {
    public int countVowelSubstrings(String word) {
        word.toLowerCase();
        int vow = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < word.length() - 4; i++) {
            set.clear();
            for (int j = i; j < word.length(); j++) {
                if (word.charAt(j) == 'a' || word.charAt(j) == 'e' || word.charAt(j) == 'i' || word.charAt(j) == 'o' || word.charAt(j) == 'u') {
                    set.add(word.charAt(j));
                    if (set.size() == 5) {
                        vow++;
                    }
                } else {
                    break;
                }
            }
        }
        return vow;
    }
}