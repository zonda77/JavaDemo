package leetcode.shuzu;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/1623:33
 * @description
 **/
public class removeElement {
    public int removeElement(int[] nums, int val) {
        int res = 0;
        int slowIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val){
                nums[slowIndex] = nums[i];
                slowIndex++;
                res++;
            }
        }
        return res;
    }
}
