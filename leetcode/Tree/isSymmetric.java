package leetcode.Tree;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/77:15
 * @description
 **/
public class isSymmetric {
    public static void main(String[] args) {
        TreeNode treeNode4 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(2,null,treeNode4);
        TreeNode treeNode3 = new TreeNode(2,null,treeNode5);
        TreeNode treeNode = new TreeNode(1,treeNode2,treeNode3);
        System.out.println(isSymmetric(treeNode));
    }
    public static boolean isSymmetric(TreeNode root) {
        if(root == null) return false;
        return judgeSymmetric(root.left,root.right);
    }
    public static boolean judgeSymmetric(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if(left == null && right != null) return false;
        if(left != null && right == null) return false;
        if(left.val != right.val) return false;
        boolean out= judgeSymmetric(left.left, right.right);
        boolean in = judgeSymmetric(left.right, right.left);
        return out && in;
    }
}
