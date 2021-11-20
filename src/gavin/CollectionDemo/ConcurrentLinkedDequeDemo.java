package gavin.CollectionDemo;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeDemo {

    public static void main(String[] args) {
        Queue<Integer> q= new ConcurrentLinkedDeque<>();
        q.add(1);//底层是用的offer，所以推荐用offer方法
        System.out.println(q.poll());//返回第一个并在队列中删除
        System.out.println(q.size());
        q.offer(2);
        System.out.println(q.peek());//返回第一个但是不删除
        System.out.println(q.element());//底层是peek方法,所以推荐用peek
        System.out.println(q.remove());//底层是poll方法
        q.offer(null);//抛异常
        System.out.println(q);

    }


}
