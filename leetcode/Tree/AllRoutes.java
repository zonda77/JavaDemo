package leetcode.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/822:36
 * @description
 **/
public class AllRoutes {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3));
        List<String> strings = binaryTreePaths(treeNode);
        for(String s:strings){
            System.out.println(s);
        }
    }
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> list =  new ArrayList<String>();
        ArrayList<Integer> path = new ArrayList<Integer>();
        LinkedList<Object> objects = new LinkedList<>();
        objects.size();
        addRoute(root,path,list);
        return list;
    }
    public static void addRoute(TreeNode root,ArrayList<Integer> path,List<String> list){
        if(root == null) return;
        if(root.left == null && root.right == null){
            path.add(root.val);
            StringBuffer str = new StringBuffer();
            for(int i = 0;i < path.size()-1;i++){
                str.append(path.get(i) + "->");
            }
            str.append(path.get(path.size() - 1));
            list.add(new String(str));
            return;
        }
        path.add(root.val);
        if(root.left != null){
            addRoute(root.left,path,list);
            path.remove(path.size()-1);
        }
        if(root.right != null){
            addRoute(root.right,path,list);
            path.remove(path.size()-1);
        }
    }
}
