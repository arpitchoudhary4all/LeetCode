/*
Given a sorted array and a target value, return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.
You may assume no duplicates in the array.
*/
class Solution {
    public int searchInsert(int[] nums, int target) {
        int  n = nums.length;
        if(target<=nums[0]){  
            return 0;
        }else if (target>nums[n-1]){
            return n;
        }else{    
            int res = -1;
            for(int i =0;i<n-1;i++){
                if(nums[i]<target&& nums[i+1]>=target){
                    res = i+1;
                }
            }
            return res;
        }
    }
}
