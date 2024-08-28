package leetcode.shuzu;

import java.util.Scanner;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/2522:51
 * @description
 **/
public class qujianhe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s2 = scanner.nextLine();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            scanner.nextLine();
            res[i] = num;
        }
        while(scanner.hasNext()){
            String s = scanner.nextLine();
            String[] s1 = s.split(" ");
            int indexStart = Integer.parseInt(s1[0]);
            int endIndex = Integer.parseInt(s1[1]);
            int sum = 0;
            for(int i = indexStart;i <= endIndex;i++){
                sum += res[i];
            }
            System.out.println(sum);
        }
    }
}
