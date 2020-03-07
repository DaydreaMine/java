//声明一个int型的数组，循环接收8个学生的成绩，计算这8个学生的总分及平均分、最高分和最低分

import java.util.*;

class Task19 {
    public static void main(String[] args) {
        int arr[] = new int[8];
        for (int i = 0; i < 8; i++) {
            System.out.println("第" + (i + 1) + "名学生成绩为:");
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        double avg = 0;
        int max = arr[0];
        int min = arr[0];
        for (int j = 0; j < 8; j++) {
            sum += arr[j];
            max = (max > arr[j]) ? max : arr[j];
            min = (min < arr[j]) ? min : arr[j];
        }
        avg = (double) sum / 10;
        System.out.println("总分:" + sum + "平均分:" + avg + "最高分:" + max + "最低分:" + min);
    }
}