package leetcode.Tree;

import java.util.ArrayList;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/820:57
 * @description
 **/
public class NodeNum {
    private static int num = 0;
    public static void main(String[] args) {
        int i = countNodes(new TreeNode(1,new TreeNode(2),new TreeNode(3)));
        System.out.println(i);
        ArrayList<Object> objects = new ArrayList<>();
        objects.remove(objects.size()-1);
        objects.get(0);
    }

    public static int countNodes(TreeNode root) {
        if(root == null) return num;
        numTrace(root);
        return num;
    }
    public static void numTrace(TreeNode root){
        if(root.left == null && root.right == null){
            num++;
            return;
        }
        num++;
        if(root.left != null) numTrace(root.left);
        if(root.right != null) numTrace(root.right);
    }
}
