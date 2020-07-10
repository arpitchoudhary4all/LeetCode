/*
Given a binary tree, write a function to get the maximum width of the given tree.
The width of a tree is the maximum width among all levels.
The binary tree has the same structure as a full binary tree, but some nodes are null.
The width of one level is defined as the length between the end-nodes (the leftmost and right most non-null nodes in the level,
where the null nodes between the end-nodes are also counted into the length calculation.
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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        Deque<TreeNode> dq =  new LinkedList<>();
        dq.add(root);
        int max =1;
        while(!dq.isEmpty()){
            while(!dq.isEmpty()&&dq.getFirst()==null){
                dq.removeFirst();       
            }
            while(!dq.isEmpty()&&dq.getLast()==null){
                dq.removeLast();       
            }
            int size = dq.size();
            max = Math.max(max,size);
            for(int i=0;i<size;i++){
                TreeNode temp = dq.poll();
                if(temp==null){
                    dq.add(null);
                    dq.add(null);
                }else{
                    dq.add(temp.left);
                    dq.add(temp.right);
                }
            }
        }
        return max;
    }
}
