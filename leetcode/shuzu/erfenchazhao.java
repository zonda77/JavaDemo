package leetcode.shuzu;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/1622:51
 * @description
 **/
public class erfenchazhao {
    public static void main(String[] args) {
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }
    public static int search(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        int middle = (leftIndex+rightIndex)/2;
        while(leftIndex <= rightIndex){
            int num = nums[middle];
            if(num == target){
                return middle;
            }else if(num > target){
                rightIndex = middle-1;
                middle = (leftIndex+rightIndex)/2;
            }else{
                leftIndex = middle+1;
                middle = (leftIndex+rightIndex)/2;
            }
        }
        return -1;
    }
}
