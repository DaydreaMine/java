package ChooseCourse;

import java.awt.event.FocusEvent.Cause;
import java.util.ArrayList;
import java.util.List;

/**
 * @author DaydreaminE
 * @version 创建时间：2020年3月19日 下午5:50:49 类说明
 */
public class SetCourse {
	List<Course> courses;
	//static List<Student>students;
	
	public SetCourse() {
		courses = new ArrayList<Course>();
	//	students= new ArrayList<Student>();
	}
	
	/*public void addStudent() {
		Student student1 = new Student("A", 1);
		students.add(student1);
		Student student2 = new Student("B", 2);
		students.add(student2);
		Student student3 = new Student("C", 3);
		students.add(student3);
	}*/

	public void addCourse() {
		Course course1 = new Course(1243, "C#");
		courses.add(course1);
		Course course2 = new Course(1246, "java");
		courses.add(course2);
		Course course3 = new Course(1277, "python");
		courses.add(course3);
		Course course4 = new Course(1322, "go");
		courses.add(course4);
		Course course5 = new Course(2333, "php");
		courses.add(course5);
	}

	public void printCourse() {
		for (Course obj : courses) {
			System.out.print("课程" + obj.getCourseID() +":" + obj.getCourseName()+"  ");
		}
	}

	public static <E> void main(String[] args) {
		SetCourse setcourse = new SetCourse();
		setcourse.addCourse();
		SetCourse s1 = setcourse;
		Student student = new Student("A",123);
		Course course1 = new Course(1243, "C#");
		Course course2 = new Course(1246, "java");
		Course course3 = new Course(1277, "python");
		Course course4 = new Course(1322, "go");
		Course course5 = new Course(2333, "php");
	    
		
		

	}

}
