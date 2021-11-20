package gavin.CollectionDemo;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer>linkedList= new LinkedList<>();
        List<Integer> lks = Collections.synchronizedList(linkedList);//同步链表
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(8);
        linkedList.add(4);
        linkedList.add(5);
        lks.add(100);
        linkedList.add(0,12);
        System.out.println(lks);
        System.out.println(linkedList.peek());//返回第一个元素
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekFirst());//返回第一个元素
        System.out.println(linkedList.peekLast());//返回最后一个元素
        System.out.println(linkedList.element());//返回第一个元素
        System.out.println(linkedList.offer(88));//链表尾部插入一个元素
        System.out.println(linkedList.offerFirst(99));//链表头部插入一个元素
        System.out.println(linkedList.offerLast(100));//链表尾部插入一个元素
        System.out.println(linkedList);
        System.out.println(linkedList.poll());//检索并删除第一个元素,返回这个元素
        System.out.println(linkedList.pollFirst());//检索并删除第一个元素,返回这个元素
        System.out.println(linkedList.pollLast());//检索并删除最后一个元素,返回这个元素
        System.out.println(linkedList);
        linkedList.removeFirst();//移除第一个
        linkedList.removeLast();//移除第二个
    }
}
