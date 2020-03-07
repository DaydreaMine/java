import java.io.*;
import java.util.*;

class Task6{
    public static void main(String[] args){
        System.out.println("输入一个数:");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        String a =num%2==0?"偶数":"奇数";
        System.out.println(a);

    }


}