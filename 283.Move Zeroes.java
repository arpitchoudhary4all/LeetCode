/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int c = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) 
            if (nums[i] != 0) 
                nums[c++] = nums[i];
        while (c < n) 
            nums[c++] = 0; 
    }
}
