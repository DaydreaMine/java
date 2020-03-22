package Student_Map;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeMap;

/**
 * @author DaydreaminE
 * @version 创建时间：2020年3月21日 下午8:19:02 类说明
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, String> map = new TreeMap<Integer, String>(new Student());
		
		Student student = new Student("A", 102);
		map.put(student.getStu_Id(), student.getName());
		Student student2 = new Student("B", 104);
		map.put(student2.getStu_Id(), student2.getName());
		Student student3 = new Student("D", 103);
		map.put(student3.getStu_Id(), student3.getName());
		Student student4 = new Student("C", 101);
		map.put(student4.getStu_Id(), student4.getName());
		Student student5 = new Student("H", 106);
		map.put(student5.getStu_Id(), student5.getName());

		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			int key = it.next();
			System.out.println(key + " " + map.get(key));
		}

	}

}
