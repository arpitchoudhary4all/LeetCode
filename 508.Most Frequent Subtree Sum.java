/*
Given the root of a tree, you are asked to find the most frequent subtree sum.
The subtree sum of node is defined as the sum of all node values formed by the subtree rooted at that node (including the node itself). 
So what is the most frequent subtree sum value? If there is a tie, return all the values with the highest frequency in any order.
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public int[] findFrequentTreeSum(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();
    
        List<Integer> output = new ArrayList<>();
        if(root == null) 
            return new int[0];
        
        int rootSumVal = dfs(root, map);
        int maxCount = Integer.MIN_VALUE;
        
        for(int key : map.keySet()) {
            int n = map.get(key);
            if(n == maxCount){
                output.add(key);
            } else if(n > maxCount) {
                maxCount = n;
                output.clear();
                output.add(key);
            }
        }
        
        int[] finalOutput = new int[output.size()];
        int i = 0;
        for(int num : output) {
            finalOutput[i] = num;
            i++;
        }
        return finalOutput;
    }
    
    private int dfs(TreeNode node, HashMap<Integer, Integer> map) {
        if(node == null) 
            return 0;
        
        int left = dfs(node.left, map);
        int right = dfs(node.right, map);
        int subSumVal = node.val + left + right;
        map.put(subSumVal, map.getOrDefault(subSumVal, 0) + 1);
        
        return subSumVal;
    }
}
