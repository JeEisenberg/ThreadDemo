package gavin.CollectionDemo;

import gavin.CollectionDemo.Other.FRUIT;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class EnumSetTest{
    private static FRUIT[] enumTestArr = FRUIT.values();
    public static void main(String[] args) {
        Set set = new HashSet<FRUIT>();
        int i = 0;
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        System.out.println("HashSet-----Begin " + df.format(new Date()));
        while (i <= 1000) {
            addEnumerate(set);
            removeEnumerate(set);
            i++;
        }
        System.out.println("HashSet-----End  " + df.format(new Date()));


        EnumSet<FRUIT> enumSet = EnumSet.noneOf(FRUIT.class);
        i = 0;
        System.out.println("EnumSet...Begin " + df.format(new Date()));
        while (i <= 1000) {
            addEnumerate(enumSet);
            removeEnumerate(enumSet);
            i++;
        }
        System.out.println("EnumSet...End " + df.format(new Date()));
    }
 /*   HashSet...Begin 2021-10-29 08:38:19.887
    HashSet...End  2021-10-29 08:38:19.895
    EnumSet...Begin 2021-10-29 08:38:19.895
    EnumSet...End 2021-10-29 08:38:19.897*/

    private static void addEnumerate(Set set) {
        for (FRUIT t : enumTestArr) {
            set.add(t);
        }
    }

    private static void removeEnumerate(Set set) {
        for (FRUIT t : enumTestArr) {
            set.remove(t);
        }
    }
}