package gavin.CollectionDemo.Other;


import java.util.LinkedHashSet;
import java.util.Set;
public class Test {
    public static void main(String[] args) {
        Integer [] a= {9,10,6,6,1,9,3,5,6,4};
        Set <Integer>set = new LinkedHashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        Object[] obj = set.toArray();
        for (Object o :
                obj) {
            System.out.print(o+" ");
        }
    }
}
