/*
Given an array of integers nums which is sorted in ascending order, 
and an integer target, write a function to search target in nums. 
If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.
*/
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0, h = n-1;
        int p = 0;
        while(l<=h){
            p = l+(h-l)/2;
            if(nums[p]==target)
                return p;
            if(target<nums[p])
                h = p-1;
            else
                l = p+1;
        }
        return -1;
    }
}
