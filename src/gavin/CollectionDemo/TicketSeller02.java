package gavin.CollectionDemo;

import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public class TicketSeller02 {
    static Vector<String>vector= new Vector<>();
    static {
        for (int i = 1; i <11; i++) {
            vector.add("第--"+i+"张票");
        }
    }

    static Stack<String>stack= new Stack<>();
    static {
        for (int i = 1; i < 11; i++) {
           // stack.add("第--"+i+"张票");
            stack.push("第--"+i+"张票");

        }

    }

    static CopyOnWriteArrayList<String> coa=new CopyOnWriteArrayList<>();
    static {
        for (int i = 1; i <11 ; i++) {
            coa.add("第--"+i+"张票");
        }



    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                while (true){
                    synchronized (TicketSeller02.class) {
                        if(vector.size()<=0) break;
                        try {
                            TimeUnit.MICROSECONDS.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                System.out.println(vector.remove(0));
                }
            }).start();
        }

        for (int i = 0; i < 100; i++) {
            new Thread(()->{while (stack.size()>0){
                System.out.println(stack.remove(0));}
            })/*.start()*/;
        }

        for (int i = 0; i < 10; i++) {
            new Thread(()->{while (coa.size()>0){
                System.out.println(coa.remove(0));}
            })/*.start()*/;
        }

    }
}
