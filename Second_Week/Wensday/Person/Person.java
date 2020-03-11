package Person;


public class Person {

	private String name;
	private String gender;
	private int  age;
	private String nationality;
	
	public Person() {}
	
	public Person(String name, String gender, int age, String nationality) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.nationality = nationality;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public void eat(){
		System.out.println("人类要吃饭");
	}
	
	public void sleep() {
		System.out.println("人类要睡觉");
	}
	
	public void work() {
		System.out.println("人类得工作");
	}
	
	public String tosString() {
		return "姓名 "+this.getName()+" 性别 "+this.getGender()+" 年龄 "+this.getAge()+" 国籍 "+this.getNationality();
	}
	
}
