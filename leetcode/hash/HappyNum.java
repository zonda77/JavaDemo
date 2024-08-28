package leetcode.hash;

import java.util.HashSet;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/1812:02
 * @description
 **/
public class HappyNum {
    public static void main(String[] args) {
        System.out.println(isHappy(1));
    }
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(true){
            n = getNextNum(n);
            if(set.contains(n)){
                return false;
            }else if(n == 1) return true;
            else set.add(n);
        }
    }
    public static int getNextNum(int num){
        int newNum = 0;
        while(num >= 10){
            int temp = num%10;
            newNum += temp * temp;
            num = num/10;
        }
        return newNum+num*num;
    }

}
