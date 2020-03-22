package Person_Hash;

import java.util.HashSet;

//1.在HashSet集合中添加三个Person对象，把姓名相同的人当做同一个人，禁止重复添加
/**
 * @author DaydreaminE
 * @version 创建时间：2020年3月21日 下午8:10:27 类说明
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person("孙大圣", 29, "male");
		HashSet<Object> hashSet = new HashSet<Object>();
		hashSet.add(person);

		Person person2 = new Person("孙大圣", 28, "male");
		hashSet.add(person2);

		Person person3 = new Person("A", 22, "female");
		hashSet.add(person3);

		for (Object object : hashSet) {
			Person p = (Person) object;
			System.out.println(p.getName() + p.getAge() + p.getGender());
		}

	}

}
