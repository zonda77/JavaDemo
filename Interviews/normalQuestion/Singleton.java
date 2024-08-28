package Interviews.normalQuestion;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/2823:05
 * @description
 **/
public class Singleton {
    private static volatile Singleton singleton;
    private Singleton(){
    }
    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
