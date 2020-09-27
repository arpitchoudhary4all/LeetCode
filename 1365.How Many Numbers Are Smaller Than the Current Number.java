/*
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. 
That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
Return the answer in an array.
*/
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
         var buck = new int[101];
        
        for (int i = 0; i < nums.length; i++)
            buck[nums[i]]++; 
        for (int i = 1; i < buck.length; i++)
            buck[i] += buck[i - 1];    

        for (int i = 0; i < nums.length; i++)
            nums[i] = nums[i] == 0 ? 0 : buck[nums[i] - 1];
        
        return nums;
    }
}
