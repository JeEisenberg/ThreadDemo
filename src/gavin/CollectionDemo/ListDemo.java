package gavin.CollectionDemo;

import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> he = List.of("你好");
        he.add("hello");
        he.forEach(s -> {
            System.out.println(s);
        });
    }
}
