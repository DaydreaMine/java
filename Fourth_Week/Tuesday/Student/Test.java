package Student;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author DaydreaminE
 * @version 创建时间：2020年3月24日 下午8:52:46 类说明
 */
public class Test {

	public static void main(String[] args) throws IOException {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("A", 12));
		list.add(new Student("B", 42));
		list.add(new Student("C", 11));
		list.add(new Student("D", 13));
		list.add(new Student("E", 15));

		File file = new File("/io/student.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(file);
			for (int i = 0; i < list.size(); i++) {
				Student student = list.get(i);
				outputStream.write(student.getName().getBytes());
				outputStream.write(student.getAge());
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			outputStream.close();
		}

		InputStream inputStream = null;
		byte[] by = new byte[(int) file.length()];
		try {
			inputStream = new FileInputStream(file);
			inputStream.read(by);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			inputStream.close();

		}
	}

}
