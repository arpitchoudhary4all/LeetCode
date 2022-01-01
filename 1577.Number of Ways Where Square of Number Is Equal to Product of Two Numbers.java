/*
Given two arrays of integers nums1 and nums2, return the number of triplets formed (type 1 and type 2) under the following rules:

Type 1: Triplet (i, j, k) if nums1[i]2 == nums2[j] * nums2[k] where 0 <= i < nums1.length and 0 <= j < k < nums2.length.
Type 2: Triplet (i, j, k) if nums2[i]2 == nums1[j] * nums1[k] where 0 <= i < nums2.length and 0 <= j < k < nums1.length.
*/

class Solution {
    public int numTriplets(int[] nums1, int[] nums2) {
        return preProcessProblem(nums1, nums2) + preProcessProblem(nums2, nums1);
    }
    public int preProcessProblem(int [] nums1, int [] nums2) {
        int result = 0;
        int n1 = nums1.length; 
        int n2 = nums2.length;
        Map<Long, Integer> map = new HashMap<>();
        for (int i=0; i<n1; i++) {
            map.put((long)nums1[i]*nums1[i], map.getOrDefault((long)nums1[i]*nums1[i], 0) + 1);
        }
        for (int j=0; j<n2; j++) {
            for (int k=j+1; k<n2; k++) {
                result += (long)map.getOrDefault((long)nums2[j]*nums2[k], 0);
            }
        }
        return result;
    }
}
