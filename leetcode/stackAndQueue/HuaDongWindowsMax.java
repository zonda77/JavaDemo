package leetcode.stackAndQueue;

import java.util.PriorityQueue;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/2023:31
 * @description
 **/
public class HuaDongWindowsMax {
    public static void main(String[] args) {
        int[] ints = maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
        for(int i:ints){
            System.out.println(i);
        }
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        PriorityQueue<Integer> queue = new PriorityQueue<>(k,(a,b)-> b-a);
        for(int i = 0;i < k;i++){
            queue.add(nums[i]);
        }
        int i = 0;
        int m = k;
        for (int j = 0; j < nums.length - k + 1; j++) {
            res[i] = queue.poll();
            queue.add(nums[m]);
            m++;
        }
        return res;
    }
}
