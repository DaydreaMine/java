//输入10个整数存入数组，然后复制到b数组中输出

import java.util.*;

class Task18 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            arr1[i] = num;
        }

        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        for (int j = 0; j < 10; j++) {
            System.out.print(arr2[j] + " ");
        }
    }
}