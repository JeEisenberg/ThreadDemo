package gavin.CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TicketSeller01 {
    static List<String> list= new ArrayList<>();
    static{
        for (int i = 1; i < 11; i++) {
            list.add("第--"+i+"张票");
        }
    }
    public static void main(String[] args) {
        List<String> list1 = Collections.synchronizedList(list);
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                while(list1.size()>0){
                    System.out.println(list1.remove(0));
                }
            }).start();
        }

    }
}
