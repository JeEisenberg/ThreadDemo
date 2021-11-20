package gavin.CollectionDemo.Other;

import java.util.Scanner;

public class Demo {
    static   int big = 0;
    static  int small = 0;
    static int num = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入");
        String line = sc.nextLine();


        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (ch > 47 && ch < 58) {
                ++num;
            } else if (ch > 54 && ch < 91) {
                ++big;
            } else if (ch >96 && ch < 123) {
                ++ small;
            }
        }
        System.out.println(num);
        System.out.println(small);
        System.out.println(big);
        sc.close();
    }
}
