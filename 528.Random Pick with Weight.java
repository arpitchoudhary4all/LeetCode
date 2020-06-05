/*
Given an array w of positive integers, where w[i] describes the weight of index i. 
Write a function pickIndex which randomly picks an index in proportion to its weight.

Note:
1   1<=w.length<=10000
2   1<=w[i]<=10^5
3   pickIndex will be called at most 10000 times.
*/

class Solution {

    int[] accumulatedSum;
    Random random;
    public Solution(int[] w) {
        random = new Random();
        accumulatedSum = new int[w.length];
        int currSum = 0;
        for (int i = 0; i < w.length; i++) {
            currSum += w[i];
            accumulatedSum[i] = currSum;
        }
    }
    
    public int pickIndex() {
        int target = random.nextInt(accumulatedSum[accumulatedSum.length - 1]) + 1;
        return binarySearch(accumulatedSum, 0, accumulatedSum.length - 1, target);
    }
    
    private int binarySearch(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        
        return left;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
