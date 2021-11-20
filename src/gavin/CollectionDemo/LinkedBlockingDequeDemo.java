package gavin.CollectionDemo;

import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDequeDemo {

   static  LinkedBlockingDeque<String> blockingDeque=new LinkedBlockingDeque<>();
static{
    for (int i = 1; i < 1000; i++) {
        blockingDeque.offerFirst("第--"+i+"张票");
    }
}


    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                while (true){
                    String s = blockingDeque.pollFirst();
                    if(s==null) break;
                    System.out.println(s);
                }
            }).start();
        }

    }

}
