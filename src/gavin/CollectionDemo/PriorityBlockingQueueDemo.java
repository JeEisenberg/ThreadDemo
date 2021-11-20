package gavin.CollectionDemo;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue= new PriorityBlockingQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(6);
        queue.add(4);
        queue.add(5);

        System.out.println(queue);

    }
}
