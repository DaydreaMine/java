package Exam_System;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author DaydreaminE
 * @version 创建时间：2020年3月21日 下午3:29:00 类说明
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 初始化学生集合
		List<Object> list_Stu = new ArrayList<Object>();
		for (int i = 0; i < 4; i++) {
			Student student = new Student("A" + i, 0214 + i, 1110 + i, 0);
			list_Stu.add(student);
		}

		// 初始化题目集合
		List<Object> list_Topic = new ArrayList<Object>();
		String[] answerStr = { "A", "B", "C", "D" };
		for (int i = 0; i < 10; i++) {
			int index = (int) (Math.random() * answerStr.length);
			Topic topic = new Topic(i + 1, "第" + (i + 1) + "问");
			topic.setAnswer(answerStr[index]);
			list_Topic.add(topic);
		}

		breakTest: while (true) {
			System.out.println("输入正确姓名：");
			Scanner sc = new Scanner(System.in);
			// 输入姓名
			String name = sc.next();
			double score = 0;
			for (int i = 0; i < list_Stu.size(); i++) {
				Student student = (Student) list_Stu.get(i);// 调出集合list_Stu中的指定student对象
				// 判断姓名是否在系统中
				if (student.getName().equals(name)) {
					System.out.println("输入密码：");
					// 判断密码是否正确
					while (true) {
						int pwd = sc.nextInt();						
						if (student.getStuPWD() == pwd) {
							System.out.println("输入成功,进入考试。");
							// 开始答题
							for (int j = 0; j < list_Topic.size(); j++) {
								Topic topic = (Topic) list_Topic.get(j);
								System.out.println(topic.toString());
								System.out.println("输入答案：");
								Scanner sc1 = new Scanner(System.in);
								String answer = sc1.next();
								if (topic.getAnswer().equals(answer)) {
									score += 10;
								}
							}
							student.setStuScore(score);
							list_Stu.set(i, student);
							System.out.println(student.toString());
							break;
						} else {
							System.out.println("输入正确密码！");
						}
					}
					break breakTest;
				}
			}
		}
		// System.out.println(list_Stu);
	}
}
