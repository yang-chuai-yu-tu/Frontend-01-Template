package week02;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
       ArrayList<Integer> res = new ArrayList<>();
       if(root == null) return res;
       Stack<TreeNode> stack = new Stack<>();
       stack.push(root);
       while(!stack.isEmpty()){
           TreeNode cur = stack.pop();
           res.add(cur.val);
           if(cur.right != null) stack.push(cur.right);
           if(cur.left != null) stack.push(cur.left);
       }
       return res;
    }

}
