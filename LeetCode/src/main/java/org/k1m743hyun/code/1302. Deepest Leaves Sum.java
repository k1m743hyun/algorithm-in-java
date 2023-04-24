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

    private int maxDepth = 0;
    private int sum = 0;

    public int deepestLeavesSum(TreeNode root) {

        this.maxDepth = getDepth(root);

        leaveSum(root, 1);
        
        return this.sum;
    }

    public int getDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        return Math.max(getDepth(root.left), getDepth(root.right)) + 1;

    }

    public void leaveSum(TreeNode root, int currDepth) {

        if (root != null) {
            if (currDepth == this.maxDepth) {
                this.sum += root.val;
            }
            leaveSum(root.left, currDepth + 1);
            leaveSum(root.right, currDepth + 1);
        }
    }
}