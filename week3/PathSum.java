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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) 
            return false;
        
        return sum(root,targetSum, 0);
    }
    
    public boolean sum(TreeNode root,int targetSum, int currSum){
          if (root == null)
            return false;
        currSum += root.val;
        if (currSum == targetSum && root.left == null && root.right == null)
            return true;
        if (sum(root.left, targetSum, currSum) || sum(root.right, targetSum, currSum))
            return true;
        return false;
    }
}
