/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/511:51
 * @description
 **/
public class Producer extends Thread {
    private Shop shop;
    public Producer(Shop shop) {
        this.shop = shop;
    }

    @Override

    public void run() {
        System.out.println(getName() + ":开始生产面包…");
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            shop.produceBread();
        }
    }
}
