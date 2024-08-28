package leetcode.stackAndQueue;

import java.util.LinkedList;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/2021:21
 * @description
 **/
public class MyStack {
    LinkedList<Integer> queue;
    public MyStack() {
        this.queue = new LinkedList<Integer>();
    }

    public void push(int x) {
        queue.offer(x);
    }

    public int pop() {
        for(int i = 0;i < queue.size() - 1;i++){
            queue.offer(queue.poll());
        }
        return queue.pop();
    }

    public int top() {
        for(int i = 0;i < queue.size() - 1;i++){
            queue.offer(queue.poll());
        }
        int res = queue.pop();
        queue.offer(res);
        return res;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
