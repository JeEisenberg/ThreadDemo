package gavin.CollectionDemo;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer>stack= new Stack<>();
        stack.add(10);
        stack.add(88);
        stack.add(99);
        stack.add(111);
        stack.add(88);

        Integer peek = stack.peek();//查看栈顶元素,而不将其移除栈;
        System.out.println("A-栈顶元素"+peek);//111

        System.out.println("B-栈顶元素"+stack.push(4444));//将4444压入栈顶
        Integer pop = stack.pop();
        System.out.println("移除栈顶元素"+pop);
        System.out.println("检查此时的栈顶元素--"+stack.peek());
        System.out.println("88所在栈的位置--"+stack.search(88));//返回对象在此堆栈上的从 1 开始的位置。

    }
}
