package leetcode.stackAndQueue;

import java.util.Stack;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/2021:37
 * @description
 **/
public class ValidKuoHao {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for(char c:chars){
            if(c == '(') stack.push(')');
            else if(c == '[') stack.push(']');
            else if(c == '{') stack.push('}');
            else{
                if(stack.isEmpty() || c != stack.pop()) return false;
            }
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
}
