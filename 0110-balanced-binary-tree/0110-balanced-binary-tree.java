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
    public boolean isBalanced(TreeNode root) {
 if(root == null) 
 {
    return true;
 }

 boolean lft =  isBalanced(root.left);
 boolean rgt =   isBalanced(root.right);
 if(!lft || !rgt)
 {
    return false;
 }  

 int lfh = height(root.left);
 int rgh =  height(root.right);

 return Math.abs( lfh - rgh)<=1;
        
    }

    public int height(TreeNode root) 
    {
        if(root ==null)
        {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }
}