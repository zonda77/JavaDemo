package Interviews.xiaomi.Duoxiancheng_Problem;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/517:26
 * @description 修改了两个线程获取锁的顺序，因为获取锁的顺序都是一样的，所以不会产生互相等待释放锁的环路
 * 解决死锁问题的方法：破坏那四个可能出现死锁的条件
 * 1.资源可共享
 * 2.资源可以在执行期间被剥夺
 * 3.线程等待其他资源必须释放自身的资源
 * 4.多线程顺序获取资源
 **/
public class Duoxiancheng_Problem_solved {
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
                synchronized (s2){
                    s1.append('b');
                    System.out.println(s1);
                    System.out.println("线程1没有被阻塞");
                }
            }
        }).start();
        new Thread(()->{
            synchronized (s1){
                //第二个线程也是先需要s1的锁
                s2.append('A');
                try {
                    Thread.sleep(1000);
                    System.out.println("如果下面没有输出说明有线程2被阻塞了");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                //需要获得s1的锁，但是被线程一占领，但是线程二自己也不想先放弃s2的锁
                synchronized (s2){
                    s2.append('B');
                    System.out.println(s2);
                    System.out.println("线程2没有被阻塞");
                }
            }
        }).start();
    }
}

