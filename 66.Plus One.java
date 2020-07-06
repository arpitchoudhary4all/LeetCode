/*
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
You may assume the integer does not contain any leading zero, except the number 0 itself.
*/

class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        if (digits[len - 1] != 9) {
            digits[len - 1] += 1;
            return digits;
        } else {
            int i = len - 1;
            while (i >= 0 && digits[i] == 9) {
                digits[i] = 0;
                --i;
            }
            if (i == -1) {
                int[] res = new int[len + 1];
                res[0] = 1;
                for (int m = 1; m <= len; m++) {
                    res[m] = digits[m - 1];
                }
                return res;
            } else {
                digits[i] += 1;
                return digits;
            }
        }
    }
}
