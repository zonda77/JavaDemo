package leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/1811:24
 * @description
 **/
public class youxiaozimuyiweici {
    public static void main(String[] args) {
        System.out.println(isAnagram2("anagram", "nagaram"));
    }
    public static boolean isAnagram(String s, String t) {
        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < char1.length; i++) {
            if(map.containsKey(char1[i])) map.put(char1[i],map.get(char1[i])+1);
            else map.put(char1[i],1);
        }
        for (int i = 0; i < char2.length; i++) {
            if(!map.containsKey(char2[i])) return false;
            else if(map.get(char2[i]) == 0) return false;
            else map.put(char2[i],map.get(char2[i])-1);
        }
        for(Map.Entry<Character, Integer> e:map.entrySet()){
            if(e.getValue() != 0) return false;
        }
        return true;
    }
    public static boolean isAnagram2(String s, String t) {
        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();
        int[] nums = new int[26];
        for (int i = 0; i < char1.length; i++) {
            nums[char1[i] - 'a']++;
        }
        for (int i = 0; i < char2.length; i++) {
            nums[char2[i] - 'a']--;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) return false;
        }
        return true;
    }
}
