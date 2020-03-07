//7.输入一个正整数，将该数的各位左右反转输出，即输入123，输出321。（使用while循环实现）

import java.io.*;
import java.util.*;

class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a, b;
        a = num % 10;
        System.out.print(a);
        while (num > 10) {
            num = num / 10;
            b = num % 10;
            System.out.print(b);
        }
    }
}