package School;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Student student1=new Student(101, "李雷", "一年级");
		StudentVoid.addMessage(student1);
		Student student2=new Student(102, "韩梅梅", "二年级");
		StudentVoid.addMessage(student2);
		Student student3=new Student(103, "老王", "一年级");
		StudentVoid.addMessage(student3);
		Student student4=new Student(104, "大黄", "三年级");
		StudentVoid.addMessage(student4);
		Student student5=new Student(105, "小明", "一年级");
		StudentVoid.addMessage(student5);
		Student student6=new Student(106, "老司机", "三年级");
		StudentVoid.addMessage(student6);
		
		StudentVoid.judge_num(6);
		
		//姓名
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		StudentVoid.judge_Name(name);
		
		Title title1 =new Title(1, "1+1", "1", "2", "3", "4", "A");
		TitleVoid.add_Title(title1);
		Title title2 =new Title(2,"1+2","1","2","3","4","B");
		TitleVoid.add_Title(title2);
		Title title3 =new Title(3,"2+2","1","2","3","4","C");
		TitleVoid.add_Title(title3);
		Title title4 =new Title(4,"1+3","1","2","3","4","D");
		TitleVoid.add_Title(title4);
		Title title5 =new Title(5,"2+5","3","7","2","11","B");
		TitleVoid.add_Title(title5);
		Title title6 =new Title(6,"3+9","12","20","13","44","A");
		TitleVoid.add_Title(title6);
		Title title7 =new Title(7,"4+2","11","22","23","6","D");
		TitleVoid.add_Title(title7);
		Title title8 =new Title(8,"2+7","122","21","13","9","D");
		TitleVoid.add_Title(title8);
		Title title9 =new Title(9,"1+21","3","22","33","21","B");
		TitleVoid.add_Title(title9);
		Title title10 =new Title(10,"22+1","4","12","23","45","C");
		TitleVoid.add_Title(title10);
		
		
		TitleVoid.right_anSwer(10);
		
		System.out.println("成绩为："+TitleVoid.score);
		
		
	}
}
