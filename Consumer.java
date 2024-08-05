/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/511:50
 * @description
 **/
public class Consumer extends Thread{
    private Shop shop;
    public Consumer(Shop shop) {
        this.shop = shop;
    }
    @Override
    public void run() {
        System.out.println(getName() + ":开始消耗面包…");
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            shop.consumeBread();
        }
    }
}
