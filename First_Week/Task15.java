//2.输入三个班，每班10个学生的成绩，求每个班的总分和平均分

import java.util.*;
import java.io.*;

class Task15 {
    public static void main(String[] args) {
        int arr[][] = new int[3][10];
        int sum;
        double avg;
        for (int i = 0; i < 3; i++) {
            sum = 0;
            avg = 0;
            System.out.println("第" + (i + 1) + "班:");
            for (int j = 0; j < 10; j++) {
                System.out.println("输入" + (i + 1) + "班" + "第" + (j + 1) + "名同学成绩：");
                Scanner sc = new Scanner(System.in);
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
            System.out.println("第" + (i + 1) + "班总分：" + sum);
            avg = (double) sum / 10;
            System.out.println("第" + (i + 1) + "班平均分：" + avg);
        }
    }
}