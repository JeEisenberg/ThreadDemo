package gavin.CollectionDemo;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingQueueDemo {
    public static void main(String[] args) {
//        默认创建一个Integer.MAX_VALUE大小的阻塞队列
        BlockingDeque<Integer> bd=new LinkedBlockingDeque<>()  ;
        System.out.println(bd.size());
        bd.add(1);
        bd.offer(2);
        bd.addFirst(3);
        bd.addLast(4);
        bd.offerFirst(5);
        bd.offerLast(10);
        bd.removeFirst();
        bd.removeLast();
        System.out.println(bd.size());
    }
}
