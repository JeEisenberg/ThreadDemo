package gavin.CollectionDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer>linkedHashSet= new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(8);
        linkedHashSet.add(9);
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(5);
        System.out.println(linkedHashSet);
    }
}
