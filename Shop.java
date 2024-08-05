/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/511:47
 * @description
 **/
public class Shop {
    /**
     * 商店类（Shop）:定义一个成员变量，表示第几个面包，提供生产面包和消费面包的操作；
     */
        private int bread = 0;
        /**
         * 生产面包
         */
        public synchronized void produceBread() {
            if (bread < 10) {
                bread++;
                System.out.println(Thread.currentThread().getName() + ":开始生产第"+bread + "个面包");
                notify(); // 唤醒消费者线程
            } else {
                try {
                    wait(); // 告诉生产者等待一下
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        /**
         * 消费面包
         */
        public synchronized void consumeBread() {
            if (bread > 0) {
                System.out.println(Thread.currentThread().getName() + ":开始消费第" + bread + "个面包");
                bread--;
                notify(); // 唤醒生产者线程
            } else {
                try {
                    wait(); // 告诉消费者等待一下
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

