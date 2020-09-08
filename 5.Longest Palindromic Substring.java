/*
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
*/
class Solution {
    public String longestPalindrome(String s) {
        int size = s.length();
        if (size == 0) 
            return "";
        boolean[][] isPalindrome = new boolean[size][size];
        int start = 0;
        int end = 1;
        for (int i = 0; i < size; i++) {
            isPalindrome[i][i] = true;
        }
        for (int i = 0; i < size - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                isPalindrome[i][i + 1] = true;
                start = i;
                end = i + 2;
            }
        }
        for (int dist = 2; dist < size; dist++) {
            for (int i = 0; i < size - dist; i++) {
                isPalindrome[i][i + dist] = isPalindrome[i + 1][i + dist - 1] &&
                                            s.charAt(i) == s.charAt(i + dist);
                
                if (isPalindrome[i][i + dist]) {
                    start = i;
                    end = i + dist + 1;
                }
            }
        }
        return s.substring(start, end);     
    }
}
