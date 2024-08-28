package Interviews.normalQuestion;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/2823:16
 * @description
 **/
public class Main {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton i2nstance = Singleton.getInstance();
        System.out.println(instance);
        System.out.println(i2nstance);
    }
}
