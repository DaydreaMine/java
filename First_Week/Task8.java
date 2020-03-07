//从键盘输入某个十进制整数数，转换成对应的二进制整数并输出。

import java.io.*;
import java.util.*;

class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Integer.toBinaryString(num));
    }
}