package leetcode.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/1013:27
 * @description
 **/
public class AllRoutesSum {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(5,new TreeNode(4,new TreeNode(11,new TreeNode(7),new TreeNode(2)),null),new TreeNode(8,new TreeNode(13),new TreeNode(4,null,new TreeNode(1))));
        System.out.println(hasPathSum(node, 22));
    }
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        List<List<TreeNode>> res = new ArrayList<List<TreeNode>>();
        ArrayList<TreeNode> path = new ArrayList<TreeNode>();
        judgeHas(root,path,res);
        for(List<TreeNode> r:res){
            int sum = 0;
            for(TreeNode n:r){
                sum += n.val;
            }
            if(sum == targetSum){
                return true;
            }
        }
        return false;
    }
    public static void judgeHas(TreeNode root,ArrayList<TreeNode> path,List<List<TreeNode>> res){
        if(root == null) return;
        if(root.left == null && root.right == null){
            path.add(root);
            ArrayList<TreeNode> treeNodes = new ArrayList<>(path);
            res.add(treeNodes);
            return;
        }
        path.add(root);
        if(root.left != null){
            judgeHas(root.left,path,res);
            path.remove(path.size()-1);
        }
        if(root.right != null){
            judgeHas(root.right,path,res);
            path.remove(path.size()-1);
        }
    }
}
