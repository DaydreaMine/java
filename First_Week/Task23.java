/*
2:数据加密问题
        某个公司采用公用电话传递数据信息，数据是小于8位的整数(默认8位)，为了确保安全，
        在传递过程中需要加密，加密规则如下：
        首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字， 87654321   8+5=13%10=3
        最后将第一位和最后一位数字交换。 请任意给定一个小于8位的整数，
        然后，把加密后的结果在控制台打印出来*/

import java.util.*;

class Task23 {
    public static void main(String[] args) {
        long number = 0;
        int a = 0;
        int c = 0;
        long b = 0;
        int num = 0;
        long num1 = 0;
        long num2 = 0;
        long num3 = 0;
        int num5 = 0;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        num1 = number;

        //确定位数
        while (num1 > 0) {
            num1 = num1 / 10;
            num++;
        }
        num5 = num;

        //将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字
        if (num < 9) {
            while (number > 0) {
                a = (int) number % 10;
                num--;
                number = number / 10;
                num2 += ((a + 5) % 10) * Math.pow(10, num);
            }
            num3 = num2;
            System.out.println(num3);

            //将第一位和最后一位数字交换
            b = num3 % 10;
            while (num2 > 0) {
                c = (int) num2 % 10;
                num2 = num2 / 10;
            }
            num3 -= (c * Math.pow(10, num5 - 1) + b);
            num3 += (b * Math.pow(10, num5 - 1) + c);
            System.out.println(num3);
        } else {
            System.out.println("请输入小于等于8位的整数!");
        }
    }
}
