package gavin.CollectionDemo;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueDemo {
    public static void main(String[] args) {

        Queue<Integer>lq= new ConcurrentLinkedQueue<>();
        Thread []threads=new Thread[10];
        for (int i = 0; i < 10; i++) {
          threads[i]=  new Thread(()->{
                for (int j = 0; j < 1000; j++) {
                    lq.offer(j);
                }
            });
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(lq.size());
    }
}
