/*
Given a string s and a string t, check if s is subsequence of t.
A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters
without disturbing the relative positions of the remaining characters. (ie, "ace" is a subsequence of "abcde" while "aec" is not).
*/

class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        if (m == 0)  
            return true; 
        if (n == 0)  
            return false; 
        if (s.charAt(m-1) == t.charAt(n-1)) 
            return isSubsequence(s.substring(0,m-1), t.substring(0,n-1)); 
        return isSubsequence(s, t.substring(0,n-1)); 
    }
}
