/*
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
*/
class Solution {
    public boolean isPalindrome(int x) {
         if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }  
        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
         return x == revertedNumber || x == revertedNumber/10;  
    }
}
