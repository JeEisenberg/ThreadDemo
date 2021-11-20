package gavin.CollectionDemo;

import java.util.ArrayDeque;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueDemo {
    public static void main(String[] args) {
        //指定容量---必须的
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(10);
        //添加10个元素
        for (int i = 0; i < 10; i++) {
            blockingQueue.add("a"+i);
        }
//满了之后在添加,add方法添加时报异常
       // boolean qq = blockingQueue.add("qq");//java.lang.IllegalStateException: Queue full
//        满了之后在添加,offer不报异常,返回添加成功或者失败
        boolean qq = blockingQueue.offer("qq");
//        往外取
        for (int i = 0; i < 10; i++) {
            blockingQueue.poll();
        }
//       取空之后
        System.out.println("取空之后再取为---"+blockingQueue.poll());//null
        System.out.println(blockingQueue.remove());//remove 则报异常
    }

}
