package leetcode.hash;

import java.util.HashSet;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/1811:53
 * @description
 **/
public class shuzujiaoji {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet set = new HashSet<Character>();
        for(int i = 0;i < nums1.length;i++){
            set.add(nums1[i]);
        }
        HashSet<Integer> set2 = new HashSet<Integer>();
        for(int i = 0;i < nums2.length;i++){
            if(set.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        }
        int[] res = new int[set2.size()];
        int i = 0;
        for(Integer s:set2){
            res[i] = s;
            i++;
        }
        return res;
    }
}
