package leetcode.stackAndQueue;

import java.util.Stack;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/2022:35
 * @description
 **/
public class niBoLan {
    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"4","3","-"}));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String t:tokens){
            if("+".equals(t)){
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2 + temp1);
            }else if("/".equals(t)){
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2 / temp1);
            }else if("*".equals(t)){
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2 * temp1);
            }else if("-".equals(t)){
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2 - temp1);
            } else{
                stack.push(Integer.parseInt(t));
            }
        }
        return stack.pop();
    }
}
