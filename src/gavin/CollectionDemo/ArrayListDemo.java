package gavin.CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>(12);
//        使得这个list变为线程安全的集合
        List<Integer> synList = Collections.synchronizedList(list);
//        非同步的添加
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
//        同步的添加
      synList.add(1);
        list.forEach(i->{
            System.out.println(i);
        });

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //返回元素的位置----如果有多个,则返回第一个
        System.out.println(synList.indexOf(0));
        //返回这个list的浅拷贝---即只是元素的拷贝,地址是不一样的
        Object clone = list.clone();
        System.out.println(clone);
        ArrayList list1=list;//这个是深拷贝,元素和地址都拷贝

        System.out.println(2>>1);//1
        System.out.println(4>>1);//2
    }
}
