package leetcode.string;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/2019:57
 * @description
 **/
public class repeatedChildren {
    public boolean repeatedSubstringPattern(String s) {
        String S = s+s;
        return S.substring(1,S.length()-1).contains(s);
    }
}
