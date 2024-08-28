package leetcode.stackAndQueue;

import java.util.Stack;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/2021:50
 * @description
 **/
public class deleteNextSame {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
    public static String removeDuplicates(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for(char c:chars){
            if(!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        String s1 = "";
        while(!stack.isEmpty()){
            s1 = stack.pop()+s1;
        }
        return s1;
    }
}
