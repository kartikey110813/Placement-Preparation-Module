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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        
       preorder(root,list);
        
        return list;
    }
    
    public void preorder(TreeNode curr, ArrayList<Integer> res){
         if(curr == null){
           return;
        }
        
        res.add(curr.val);
        preorder(curr.left,res);
        preorder(curr.right,res);
    }
}
