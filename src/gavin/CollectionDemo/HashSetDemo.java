package gavin.CollectionDemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        //无参构造---默认16,加载因子0.75
        Set<Integer>set= new HashSet<>();
        set.add(9);
        set.add(6);
        set.add(5);
        set.add(7);
        set.add(8);
        set.add(7);
        System.out.println(set);
        //只指定初始容量,加载因子仍默认为0.75
        Set<Integer>set1= new HashSet<>(8);
        //指定初始容量,同时指定加载因子
        Set<Integer>set2= new HashSet<>(8,1);
    }
}
