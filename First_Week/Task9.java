import java.io.*;
import java.util.*;

class Task9 {

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("输入一个数:");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            a[i] = num;
        }
        int temp;
        for (int j = 0; j < 9; j++) {
            for (int k = j + 1; k < 10; k++) {
                if (a[j] > a[k]) {
                    temp = a[j];
                    a[j] = a[k];
                    a[k] = temp;
                }
            }
        }
        System.out.println(a[0]);
        System.out.println(a[9]);
    }

}