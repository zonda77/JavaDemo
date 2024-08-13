package leetcode.Tree;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/76:49
 * @description
 **/
public class reserveTree {
    public TreeNode invertTree(TreeNode root) {
        TreeNode cur = root;
        reserve(cur);
        return root;
    }
    public static void reserve(TreeNode cur){
        if(cur == null) return;
        if(cur.left == null && cur.right == null) return;
        TreeNode temp = cur.left;
        cur.left = cur.right;
        cur.right = temp;
        if(cur.left != null) reserve(cur.left);
        if(cur.right != null) reserve(cur.right);
    }
}
