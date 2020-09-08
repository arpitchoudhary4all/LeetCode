/*
Given a binary tree, each node has value 0 or 1.  
Each root-to-leaf path represents a binary number starting with the most significant bit.  

For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this could represent 01101 in binary, which is 13.
For all leaves in the tree, consider the numbers represented by the path from the root to that leaf.
Return the sum of these numbers.
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
     int rootToLeaf = 0;
    public int sumRootToLeaf(TreeNode root) {
        preorder(root, 0);
        return rootToLeaf;
    }
    private void preorder(TreeNode root, int curr){
        if(root!=null){
            curr = (curr<<1)|root.val;
            if(root.left == null &&root.right==null){
                rootToLeaf += curr; 
            }
            preorder(root.left,curr);
            preorder(root.right,curr);
        }
    }
}
