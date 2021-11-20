package gavin.CollectionDemo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

public class TicketSeller03 {
    static Queue<String> queue= new ConcurrentLinkedQueue<>();
    static {
        for (int i = 1; i <11 ; i++) {
            queue.add("第--"+i+"张票");
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 19; i++) {
            new Thread(()->{
           while(true){
               String poll = queue.poll();
               if(poll==null) break;
               try {
                   TimeUnit.MICROSECONDS.sleep(20);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               System.out.println(poll);
           }
            }).start();
        }


    }}
