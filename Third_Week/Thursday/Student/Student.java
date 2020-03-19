package Student;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author DaydreaminE
 * @version 创建时间：2020年3月19日 下午4:16:26 类说明
 */
public class Student {
	public String getName() {
		return name;
	}

	public String setName(String name) {
		this.name = name;
		return this.name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String name;
	private int id;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setId(9811);

		List<String> stff = new ArrayList<String>();
		stff.add(student.setName("A"));
		stff.add(student.setName("B"));
		stff.add(student.setName("C"));
		stff.add(student.setName("D"));
		stff.add(student.setName("E"));
		stff.add(student.setName("F"));

		ListIterator<String> li = stff.listIterator();
		while (li.hasNext()) {
			System.out.println("序号：" + (li.nextIndex() + student.getId()) + "  姓名：" + li.next());
		}

	}

}
