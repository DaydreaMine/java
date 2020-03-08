//5.请输入一个任意年份,判断是否是闰年
import java.util.*;
class Task11{
    public static void main(String[] args){
        System.out.println("请输入一个年份：");
        Scanner sc =new Scanner(System.in);
        int year =sc.nextInt();
        if((year%4==0&&year%100!=0)||(year%400==0)){
            System.out.println("闰年");
        }else{
            System.out.println("普通年");
        }

    }
}