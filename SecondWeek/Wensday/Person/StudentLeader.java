package Person;

public class StudentLeader extends Student {

	
	private String job;
	
	public StudentLeader(){}

	public StudentLeader(String name, String gender, int age, String nationality, String school, String stuNumber,String job) {
		super(name,gender,age,nationality,school,stuNumber);
		this.job = job;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	public void meeting() {
		System.out.println("学生干部需要开会");
	}
	
	public String tosString_2() {
		return " 职务 "+this.getJob();
	}
	
	
}
