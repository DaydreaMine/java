package School;

import java.util.*;

public class StudentVoid {

	public static Student[] student = new Student[6];
	public static int num = 0;

	public static void addMessage(Student st) {
		student[num] = st;
		num++;
	}

	public static void judge_num(int number) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入学号:");
		number = sc.nextInt();
		for (int i = 0; i < num; i++) {
			if (student[i].get_stuNum() == number) {
				System.out.println("输入姓名:");
				break;
			} else {
				System.out.println("输入错误！");
			}
		}
	}
	
	public static void judge_Name(String Name) {
		for (int i = 0; i < num; i++) {
			if (student[i].get_stuName().equals(Name)) {
				System.out.println("成功！");
				break;
			} else {
				System.out.println("输入错误！");
			}
		}
	}
	
	

	
	
}
