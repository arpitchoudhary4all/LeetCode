/*
Given a sorted array and a target value, return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.
You may assume no duplicates in the array.
*/
class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = -0;
        int end = nums.length-1;
        while(start<=end){
            int middle = start+(end-start)/2;
            if(target<nums[middle])
                end = middle-1;
            else if(target>nums[middle])
                start = middle+1;
            else
                return middle;
        }
        return start;
    }
}
