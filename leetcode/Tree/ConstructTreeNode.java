package leetcode.Tree;

import java.util.Arrays;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/1017:32
 * @description
 **/
public class ConstructTreeNode {
    public static TreeNode RootTreeNode;
    public static void main(String[] args) {
        TreeNode treeNode = buildTree(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3});
        System.out.println(treeNode);
    }
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        RootTreeNode = new TreeNode();
        constructTree(inorder,postorder,RootTreeNode);
        return RootTreeNode;
    }
    public static void constructTree(int[] inorder, int[] postorder, TreeNode node){
        if(inorder.length == 0 && postorder.length == 0) return;
        int nodeVal = postorder[postorder.length - 1];
        int nodeIndex = -1;
        for (int i = 0; i < inorder.length; i++) {
            if(inorder[i] == nodeVal){
                nodeIndex = i;
                break;
            }
        }
        node.val = nodeVal;//中
        int[] leftInorder = Arrays.copyOfRange(inorder, 0, nodeIndex);
        int[] rightInorder = Arrays.copyOfRange(inorder, nodeIndex+1, inorder.length);
        int[] leftpostOrder = Arrays.copyOfRange(postorder,0,nodeIndex);
        int[] rightpostOrder = Arrays.copyOfRange(postorder,nodeIndex,inorder.length-1);
        if(leftpostOrder.length != 0){
            TreeNode lefttreeNode = new TreeNode();
            node.left = lefttreeNode;
            constructTree(leftInorder,leftpostOrder,lefttreeNode);
        }

        if(rightpostOrder.length != 0){
            TreeNode righttreeNode = new TreeNode();
            node.right = righttreeNode;
            constructTree(rightInorder,rightpostOrder,righttreeNode);
        }

    }
}
