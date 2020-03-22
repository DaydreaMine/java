package Student_Map;

import java.util.Comparator;

/**
 * @author DaydreaminE
 * @version 创建时间：2020年3月21日 下午8:18:53 类说明
 */
public class Student implements Comparator<Integer> {

	private String name;
	private int Stu_Id;

	public Student() {
		super();
	}

	public Student(String name, int stu_Id) {
		super();
		this.name = name;
		Stu_Id = stu_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStu_Id() {
		return Stu_Id;
	}

	public void setStu_Id(int stu_Id) {
		Stu_Id = stu_Id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", Stu_Id=" + Stu_Id + "]";
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		//int x = o2.toString().compareTo(o1.toString());
		return o2-o1;
	}

}
