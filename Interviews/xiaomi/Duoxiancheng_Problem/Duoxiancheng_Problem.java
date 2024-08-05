package Interviews.xiaomi.Duoxiancheng_Problem;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/517:26
 * @description 这个程序演示了两个线程出现死锁的情况
 * 出现线程问题的四个条件：
 * 1.一个锁资源在同一时刻只能由一个线程占有
 * 2.一个线程在被阻塞的时候不会放弃本身已经拥有的锁
 * 3.一个线程一旦获得某个锁，无法被强制剥夺，只能自己用完释放
 * 4.多个线程同时想要获取到对方的锁资源形成闭环
 **/
public class Duoxiancheng_Problem {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();
        new Thread(()->{
            synchronized (s1){
                //第一个线程需要获取s1的锁
                s1.append('a');
                try {
                    Thread.sleep(1000);
                    System.out.println("如果下面没有输出说明有线程1被阻塞了");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                //需要获得s2的锁，但是被线程二占领，但是线程一自己也不想先放弃s1的锁
                synchronized (s2){
                    s1.append('b');
                    System.out.println(s1);
                }
            }
        }).start();
        new Thread(()->{
            synchronized (s2){
                //第二个线程需要获取s2的锁
                s2.append('A');
                try {
                    Thread.sleep(1000);
                    System.out.println("如果下面没有输出说明有线程2被阻塞了");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                //需要获得s1的锁，但是被线程一占领，但是线程二自己也不想先放弃s2的锁
                synchronized (s1){
                    s2.append('B');
                    System.out.println(s2);
                }
            }
        }).start();
    }
}

