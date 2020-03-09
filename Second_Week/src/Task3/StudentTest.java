import java.util.*;

public class StudentTest {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Student student = new Student();
        String[] arr1 = new String[]{"李雷", "韩梅梅", "小明", "老王", "大黄"};
        String[] arr2 = new String[]{"语文", "数学", "英语", "理科综合"};
        //将每门分数放到二维数组中
        int[][] arr = new int[student.getStudent_Num()][student.getStudent_courseNum()];
        //初始化总分数组
        int[] sum = new int[student.getStudent_Num()];
        int sum1 = 0;//总分初始化
        int num1 = 0;//总分最高的下标
        int num2 = 0;//理综最高的下标

        // 输入各科成绩，并求每个人的总成绩
        for (int i = 0; i < student.getStudent_Num(); i++) {
            for (int j = 0; j < student.getStudent_courseNum(); j++) {
                //键盘输入
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                student.setCourse_Result(a);
                arr[i][j] = student.getCourse_Result();
                student.setName(arr1[i]);
                student.setCourse(arr2[j]);
                System.out.println("第" + (i + 1) + "位:" + student.getStudent_Name() + "的" + student.getStudent_course() + "成绩为:");
                arr[i][j] = student.getCourse_Result();
                sum1 += arr[i][j];
            }
            sum[i] = sum1;
        }

        //三目算法求总分最高和理综最高的人
        for (int k = 0; k < student.getStudent_Num() - 1; k++) {
            num1 = (sum[k] > sum[k + 1]) ? k : k + 1;
            num2 = (arr[k][4] > arr[k + 1][4]) ? k : k + 1;
        }
        student.setName(arr1[num1]);
        System.out.println("平均分最高的是：" + student.getStudent_Name());
        System.out.println("各科成绩是：");
        for (int l = 0; l < student.getStudent_courseNum(); l++) {
            System.out.println(arr[num1][l]);
        }

        student.setName(arr1[num2]);
        System.out.println("理综最高的是：" + student.getStudent_Name());

    }
}
