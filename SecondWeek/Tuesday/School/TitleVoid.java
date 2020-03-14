package School;

import java.util.Scanner;

public class TitleVoid {

	public static Title[] title = new Title[10];  
	public static int num2 = 0;
	public static int score = 0;
	
	//题目信息放到title[]中
	public static void add_Title(Title tt) {
		title[num2]=tt;
		num2++;
	}
	
	//选择答案，并算分
	public static void right_anSwer(int number2) {
		for (int i = 0; i < number2; i++) {
			System.out.println(title[i].get_number()+"."+title[i].get_title());
			System.out.println("A "+title[i].get_answerA()+" B "+title[i].get_answerB()+" C "+title[i].get_answerC()+"D"+title[i].get_answerD());
			Scanner sr=new Scanner(System.in);	
			String anSwer=sr.next();
			if(title[i].get_answer().equals(anSwer)) {
				score++;
			}
		}
	}
	
	
}
