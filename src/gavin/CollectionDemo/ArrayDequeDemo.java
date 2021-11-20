package gavin.CollectionDemo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Stack;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<Integer>deque= new ArrayDeque<>();
        //进栈
        deque.add(0);//tail
        deque.addLast(1);
        deque.addLast(2);
        deque.addFirst(3);
        deque.addFirst(4);
        deque.addFirst(5);
//      出栈
        deque.getFirst();
        deque.getLast();
        deque.poll();
        deque.pollFirst();
        deque.pollLast();
        //Stack
        Stack<Integer>stack= new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        System.out.println(stack.peek());

    }
}
