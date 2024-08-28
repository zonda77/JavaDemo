package leetcode.shuzu;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/179:37
 * @description
 **/
public class changduzuixiaozishuzu {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int slow = 0;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length;i++) {
            sum += nums[i];
            while(sum >= target){
                res = Math.min(i - slow + 1,res);
                sum -= nums[slow];
                slow++;
            }
        }
        return res == Integer.MAX_VALUE ? 0:res;
    }
}
