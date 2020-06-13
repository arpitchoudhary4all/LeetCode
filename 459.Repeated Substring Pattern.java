/*
Given non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. 
You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.
*/
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String str = s+s;
        return  str.substring(1,str.length() -1).contains(s);
    }
}
