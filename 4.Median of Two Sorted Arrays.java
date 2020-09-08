/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
*/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length]; 
        System.arraycopy(nums1, 0, result, 0, nums1.length);
        System.arraycopy(nums2, 0, result, nums1.length, nums2.length);
        Arrays.sort(result);
        int mid;
        if(result.length%2==0){
            mid=result.length/2;
            double x =(result[mid-1]+result[mid]);
            return x/2;
        }else{
            mid= result.length/2;
            return result[mid];
        }
    }
}
