/*
Write a function that reverses a string. The input string is given as an array of characters char[].
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
You may assume all the characters consist of printable ascii characters.
*/
class Solution {
    public void reverseString(char[] s) {
        int st=0,en=s.length-1;
        while(st<=en){
            char temp = s[st];
            s[st] = s[en];
            s[en] = temp;
            st++;
            en--;
        }
    }
}
