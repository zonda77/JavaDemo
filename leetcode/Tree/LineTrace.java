package leetcode.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/76:26
 * @description
 **/
public class LineTrace {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        lineTrace(root,list,queue);
        return list;
    }
    public static void lineTrace(TreeNode root,List<List<Integer>> list,LinkedList<TreeNode> queue){
        if(root == null) return;
        queue.add(root);
        while(!queue.isEmpty()){
            int num = queue.size();
            ArrayList<Integer> lineList = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                TreeNode node = queue.poll();
                lineList.add(node.val);
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
            list.add(lineList);
        }
    }
}
class TreeNode {
     int val;
    TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

