package Person;

public class test {

	public static void main(String[] args) {
		
		Person person = new Person("骁话","男",30,"中国");
		System.out.println(person.tosString());
		person.eat();
		person.work();
		System.out.println();
		
		Student student = new Student("二五仔","男",20,"美国","豫章学院","33333");
		System.out.println(student.tosString());
		student.work();
		System.out.println();
		
		Worker worker = new Worker("孙大圣","男",20,"美国","瑞·名族之光·幸咖啡",11);
		System.out.print(worker.tosString());
		System.out.println(worker.tostrString_3());
		worker.work();
		System.out.println();
		
		StudentLeader studentLeader=new StudentLeader("毒奶","男",44,"坦桑尼亚","黄浦江学院","252525","常年留级只能当学生会长");	
		System.out.print(studentLeader.tosString());
		System.out.println(studentLeader.tosString_2());
		studentLeader.meeting();
		System.out.println();
	}
}
