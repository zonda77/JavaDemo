package leetcode.Tree;

import java.util.Arrays;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/1021:00
 * @description
 **/
public class MaxTree {
    TreeNode rootNode;
    public static void main(String[] args) {
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        rootNode = new TreeNode();
        buildTree(nums,rootNode);
        return rootNode;

    }
    public static void buildTree(int[] nums,TreeNode node){
        if(nums.length == 0) return;
        int val = nums[0];
        int maxVal = -1;
        int maxIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > val){
                maxVal = nums[i];
                maxIndex = i;
            }
        }
        node.val = maxVal;
        int[] left = Arrays.copyOfRange(nums,0,maxIndex);
        int[] right = Arrays.copyOfRange(nums,maxIndex+1,nums.length);
        if(left.length != 0){
            node.left = new TreeNode();
            buildTree(left,node.left);
        }
        if(right.length != 0){
            node.right = new TreeNode();
            buildTree(right,node.right);
        }
    }
}
