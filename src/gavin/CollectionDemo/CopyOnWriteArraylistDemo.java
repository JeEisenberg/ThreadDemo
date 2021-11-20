package gavin.CollectionDemo;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArraylistDemo {
    public static void main(String[] args) {
        //创建一个空列表
        CopyOnWriteArrayList<Integer> copy = new CopyOnWriteArrayList<>();
        //线程安全的写操做
        //写互斥
        copy.add(0);
        copy.add(1);
//     读共享
        Integer integer = copy.get(0);
        System.out.println("_________________");
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        CopyOnWriteArrayList CWASList=new CopyOnWriteArrayList(list);
        CWASList.add(100);

        System.out.println(CWASList);
        Object []objects= new Object[100];
        CopyOnWriteArrayList ca=new CopyOnWriteArrayList(objects);
        ca.add(999);
        System.out.println(ca);
        ca.add(1,12);
        ca.addAll(list);
    }
}
