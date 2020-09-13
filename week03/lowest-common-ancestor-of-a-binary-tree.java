/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 如果找到尽头也没有返回空，或者q或者p就是root的话，就直接停了返回
        if(root == null || root == q || root == p) return root;
        // 一直往左/右边走
        TreeNode left = lowestCommonAncestor( root.left,  p,  q);
        TreeNode right = lowestCommonAncestor( root.right,  p, q);
        //都是空，说明根本不在这个子树里，返回空
        if(left == null && right == null) return null;
        //左边没有返回右边，右边没有返回左边
        if(left == null) return right;
        if(right == null) return left;
        //一左一右，返回root，也就是他们的祖先
        return root;
    }
}