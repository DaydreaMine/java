package Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
* @author DaydreaminE
* @version 创建时间：2020年3月19日 下午8:53:42
* 类说明
*/
public class Student {
	
	static List<Student>data = new ArrayList<Student>();

	static class student{
		private String name ;
		private int id ;
		private int score;
			
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}

		public student(String name, int id, int score) {
			super();
			this.name = name;
			this.id = id;
			this.score = score;
			}
			
	    public String tostring() {
	    	return "学号"+id+"姓名"+name+"成绩"+score;
	    }	
			
	}
	
	public static void init_Data() {		
		Random random = new Random();
		for(int i = 0 ;i<40;i++) {
			//data.add(new student("j", 1101+i, random.nextInt(51)+50));
		}
	}
	
	
	
	
	
	
	
}
