package leetcode.shuzu;

import java.util.Scanner;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/1710:56
 * @description
 **/
public class shuzuhe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int ele = scanner.nextInt();
            res[i] = ele;
        }
        String s1 = scanner.nextLine();
        int a;
        int b;
        while(scanner.hasNext())
        {
            int sum = 0;
            a = scanner.nextInt();
            b = scanner.nextInt();
            for (int i = a; i < b; i++) {
               sum += res[i];
            }
            System.out.println(sum);
        }
    }
}
