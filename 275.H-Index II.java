/*
Given an array of citations sorted in ascending order (each citation is a non-negative integer) of a researcher, write a function to compute the researcher's h-index.
According to the definition of h-index on Wikipedia: 
"A scientist has index h if h of his/her N papers have at least h citations each, and the other N − h papers have no more than h citations each."
*/

class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;  
        int start = 0;  
        int end = n-1;  
        int middle;  
        while (start <= end){  
            middle = (end+start)/2;  
            if (citations[middle] == n-middle) 
                return citations[middle];  
            else if(citations[middle] < n-middle) 
                start = middle + 1;  
            else 
                end = middle - 1;  
        }  
        return n - end - 1;  
    }
}
