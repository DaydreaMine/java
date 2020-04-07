package Test1;

import java.util.ArrayList;
import java.util.List;
/*
完成下面的要求
        1) 创建一个List，在List 中增加三个工人，基本信息如下：
        姓名年龄工资
        zhang3 18 3000
        li4 25 3500
        wang5 22 3200
        2) 在li4 之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资3300
        3) 删除wang5 的信息
        4) 利用for 循环遍历，打印List 中所有工人的信息
        5) 利用迭代遍历，对List 中所有的工人调用work 方法。
        6) 为Worker 类重写equals 方法，当姓名、年龄、工资全部相等时候才返回true
        6. （Set，Hash 算法）为上一题的Worker 类，在添加完equals 方法的基础上，添加一个hashCode 方法。
*/

public class WorkerTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Worker("zhang3",18,3000));
        list.add(new Worker("li4",25,3500));
        list.add(new Worker("wang5",22,3200));
        list.add(1,new Worker("zhao6",24,3300));
        list.remove("wang5");
        for (Object ob:list) {
            System.out.println(ob);
        }

        Worker worker = new Worker("zhang3",18,3000);
        Worker worker1 = new Worker("zhang3",18,1000);
        System.out.println(worker.equals(worker1));
        System.out.println(worker.hashCode());
    }
}
