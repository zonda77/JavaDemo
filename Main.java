/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/511:56
 * @description
 **/
public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Producer producer = new Producer(shop);
        producer.start();
        Consumer consumer = new Consumer(shop);
        consumer.start();
    }
}
