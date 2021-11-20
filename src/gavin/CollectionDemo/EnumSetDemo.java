package gavin.CollectionDemo;


import gavin.CollectionDemo.Other.FRUIT;


import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class EnumSetDemo {
    //准备好容器
    static EnumSet<FRUIT> fruits2 = EnumSet.noneOf(FRUIT.class);
    static HashSet<FRUIT> hashSet = new HashSet<>();
    //将枚举值一个个去除放到数组中
    static FRUIT fruits[] = FRUIT.values();



    public static void main(String[] args) throws InterruptedException {


        Thread thread = new Thread(() -> {
          long  start = System.currentTimeMillis();
            for (int i = 0; i < 100000; i++) {
                AddE(hashSet);
                RemoveE(hashSet);
            }
            long end = System.currentTimeMillis();
            System.out.println(end - start);
        });
        Thread thread1 = new Thread(() -> {
          long  start = System.currentTimeMillis();
            for (int i = 0; i < 100000; i++) {
                AddE(fruits2);
                RemoveE(fruits2);
            }
            long end = System.currentTimeMillis();
            System.out.println(end - start);
        });
        thread.start();
       //thread1.start();
       thread.join();
       // thread1.join();


    }

    //    拆开挨个添加
    static void AddE(Set set) {
        for (FRUIT fruit :
                fruits) {
            set.add(fruit);
        }
    }//

    // 拆开挨个移除
    static void RemoveE(Set set) {
        for (FRUIT fruit :
                fruits) {
            set.remove(fruit);
        }
    }

}
