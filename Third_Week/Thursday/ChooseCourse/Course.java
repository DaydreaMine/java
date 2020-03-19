package ChooseCourse;
/**
* @author DaydreaminE
* @version 创建时间：2020年3月19日 下午5:42:14
* 类说明
*/

import java.util.ArrayList;
import java.util.List;

public class Course {
	
	private String CourseName;
	private int CourseID;
	
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public int getCourseID() {
		return CourseID;
	}
	public void setCourseID(int courseID) {
		CourseID = courseID;
	}
	public Course( int courseID,String courseName) {
		super();
		CourseName = courseName;
		CourseID = courseID;
	}
	
	
	

}
