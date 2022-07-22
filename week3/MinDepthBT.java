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
static int val;
public int minDepth(TreeNode root) {
if(root==null){
return 0;
}
val = Integer.MAX_VALUE;
ans(root,1);
return val;
}

public void ans(TreeNode root, int level){
    if(root==null){
        return;
    }        
    if(root.left==null && root.right==null){
        val = Math.min(val,level);
        return;
    }
           
    ans(root.left,level+1);        
    ans(root.right,level+1);
    
    }
}
