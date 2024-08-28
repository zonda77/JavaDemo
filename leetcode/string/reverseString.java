package leetcode.string;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/1922:50
 * @description
 **/
public class reverseString {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefghkj",4));
    }
    public static String reverseStr(String s, int k) {
        //先算出一共要进行几次翻转
        char[] chars = s.toCharArray();
        int len = chars.length;
        int num = len/(2*k);
        if(len%(2*k) >= k) num++;
        else{
            reverse(chars,k*(1+num),chars.length-1);
        }
        int i = 0;
        while(i < num){
            reverse(chars,i*2*k,2*i*k+k-1);
            i++;
        }
        return new String(chars);
    }
    public static void reverse(char[] chars,int startIndex,int endIndex){
        while(startIndex < endIndex){
            char temp = chars[startIndex];
            chars[startIndex] = chars[endIndex];
            chars[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
}
