package leetcode.string;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/200:05
 * @description
 **/
public class reserveWord {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is    blue"));
    }
    public static String reverseWords(String s) {
        String reverseStr = reverse(s);
        String s1 = reverseStr.trim();
        String[] s2 = s1.split(" ");
        StringBuilder res = new StringBuilder();
        for(String str:s2){
            res.append(reverse(str) + " ");
        }
        return new String(res).trim();
    }
    public static String reverse(String s){
        char[] chars = s.toCharArray();
        int startIndex = 0;
        int endIndex = chars.length - 1;
        while(startIndex < endIndex){
            char temp = chars[startIndex];
            chars[startIndex] = chars[endIndex];
            chars[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
        return new String(chars);
    }
}
