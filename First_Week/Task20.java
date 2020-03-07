//定义一个长度为10的整型数组，循环输入10个整数。 然后将输入一个整数，查找此整数，找到 输出下标，没找到给出提示。

import java.util.*;

class Task20 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 100 + 1);
            arr[i] = num;
            System.out.print(arr[i] + "   ");
        }
        System.out.println();

        int a = 0;
        System.out.println("输入一个整数：");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int b = 0;
        for (int j = 0; j < 10; j++) {
            if (a == arr[j]) {
                System.out.println("下标为:" + j);
                b++;
            }
        }
        if (b == 0) {
            System.out.println("没有这个数！");
        }
    }
}