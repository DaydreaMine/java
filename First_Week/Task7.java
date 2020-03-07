//从键盘输入一个班5个学生的分数，求和并输出

import java.io.*;
import java.util.*;

class Task7 {

    public static void main(String[] args) {
        int num = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("输入一个数:");
            Scanner sc = new Scanner(System.in);

            num += sc.nextInt();

        }
        System.out.println(num);
    }
}