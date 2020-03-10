public class Student {

	private String Student_Name; // 姓名
	private String Student_course; // 科目
	private int Student_courseNum = 4; // 科目数量
	private int course_Result; // 科目成绩
	public void setName(String Student_Name) {
		this.Student_Name = Student_Name;
	}

	public void setCourse(String Student_course) {
		this.Student_course = Student_course;
	}

	public void setCourseNum(int Studeng_courseNum) {
		this.Student_courseNum = Studeng_courseNum;
	}

	public void setCourse_Result(int course_Result) {
		if (course_Result > 0 && course_Result < 101) {
			this.course_Result = course_Result;
		} else {
			course_Result = 60;
			System.out.println("成绩输入错误！");
		}
	}

	public String getStudent_Name() {
		return this.Student_Name;
	}

	public String getStudent_course() {
		return this.Student_course;
	}

	public int getStudent_courseNum() {
		return this.Student_courseNum;
	}

	public int getCourse_Result() {
		return this.course_Result;
	}

}
