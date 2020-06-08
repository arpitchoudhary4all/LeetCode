/*
Given an array A of non-negative integers,return an array consisting of all the even elements of A,
followed by all the odd elements of A.You may return any answer array that satisfies this condition.
*/

class Solution {
    public int[] sortArrayByParity(int[] A) {
        int n = A.length;
        int start = 0;
        int end = n-1;
        while(start<=end){
            if(A[start]%2==0){
                start++;
            }else{
                if(A[end]%2==0){
                    int temp = A[start];
                    A[start] = A[end];
                    A[end] = temp;
                }
                end--;
            }
        }
        return A;
    }
}
