/*
Given a string s. Return all the words vertically in the same order in which they appear in s.
Words are returned as a list of strings, complete with spaces when is necessary. (Trailing spaces are not allowed).
Each word would be put on only one column and that in one column there will be only one word.
*/
class Solution {
    public List<String> printVertically(String s) {
        List<String> res = new ArrayList<>();
        String[] words = s.split(" ");
        int maxLength = 0;
        for (String word : words) {
            maxLength = Math.max(maxLength, word.length());
        }
        for (int i = 0; i < maxLength; i ++) {
            StringBuilder sb = new StringBuilder();
            for (String word : words) {
                if (i >= word.length()) {
                    sb.append(" ");
                } else {
                    sb.append(word.charAt(i));
                }
            }
            res.add(trimRight(sb.toString()));
        }
        return res;
    }
    private String trimRight(String word) {

        int pointer = word.length();
        while (--pointer > -1) {
            if (word.charAt(pointer) != ' ') {
                return word.substring(0, pointer + 1);
            }   
        }
        return null;
    }
}
