//1.你的程序要读入一系列正整数数据，输入-1表示输入结束，-1本身不是输入的数据。程序输出读到的数据中的奇数和偶数的个数。
//	输入格式:一系列正整数，整数的范围是（0,100000）。如果输入-1则表示输入结束。
//	输出格式：两个整数，第一个整数表示读入数据中的奇数的个数，第二个整数表示读入数据中的偶数的个数。两个整数之间以空格分隔。

import java.util.*;

class Task22 {
    public static void main(String[] args) {
        int a = 0;
        int b = -1;
        int num = 1;
        System.out.println("输入0～100000整数");
        do {
            Scanner sc = new Scanner(System.in);
            if (num >= 0 && num <= 100000) {
                if (num != 0) {
                    if (num % 2 == 0) {
                        a++;
                    } else {
                        b++;
                    }
                }
            } else {
                System.out.println("输入0～100000整数!");
            }
            num = sc.nextInt();
        } while (num != -1);
        System.out.println(b + "     " + a);
    }
}