import java.util.*;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		String[] arr1 = new String[] { "李雷", "韩梅梅", "小明", "老王", "大黄" };
		String[] arr2 = new String[] { "语文", "数学", "英语", "理科综合" };
		// 将每门分数放到二维数组中
		int[][] arr = new int[5][student.getStudent_courseNum()];
		// 初始化总分数组
		int[] sum = new int[5];
		// 输入各科成绩，并求每个人的总成绩
		for (int i = 0; i < 5; i++) {
			int sum1 = 0;// 总分初始化
			for (int j = 0; j < student.getStudent_courseNum(); j++) {
				// 键盘输入
				student.setName(arr1[i]);
				student.setCourse(arr2[j]);
				System.out.print(
						"第" + (i + 1) + "位:" + student.getStudent_Name() + "的" + student.getStudent_course() + "成绩为: ");
				Scanner sc = new Scanner(System.in);
				int a = sc.nextInt();
				student.setCourse_Result(a);
				arr[i][j] = student.getCourse_Result();
				sum1 += arr[i][j];
			}
			sum[i] = sum1;
		}

		int num1 = 0;// 总分最高的下标
		int num2 = 0;// 理综最高的下标
		// 三目算法求总分最高和理综最高的人
		for (int k = 0; k < 4; k++) {
			num1 = (sum[num1] > sum[k + 1]) ? num1 : k + 1;
			num2 = (arr[k][3] > arr[k + 1][3]) ? num1 : k + 1;
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
