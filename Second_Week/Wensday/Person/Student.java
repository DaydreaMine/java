package Person;

public class Student extends Person {

	private String school;
	private String stuNumber;
	
	public Student() {}
	
	public Student(String name, String gender, int age, String nationality, String school, String stuNumber) {
		super(name,gender,age,nationality);
		this.school = school;
		this.stuNumber = stuNumber;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getStuNumber() {
		return stuNumber;
	}

	public void setStuNumber(String stuNumber) {
		this.stuNumber = stuNumber;
	}

	public void work() {
		System.out.println("学生的工作就是学习");
	}
	
	public String tosString() {
		return "姓名 "+this.getName()+" 性别 "+this.getGender()+" 年龄 "+this.getAge()+" 国籍 "+this.getNationality()+" 学校 "+this.getSchool()+" 学号 "+this.getStuNumber();
	}
}
