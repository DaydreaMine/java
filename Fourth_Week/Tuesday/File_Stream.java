import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author DaydreaminE
 * @version 创建时间：2020年3月24日 下午7:31:47 类说明
 */
public class File_Stream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("Tuesday/test.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(file);
			String string = "Hello World";
			outputStream.write(string.getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				outputStream.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

		File file2 = new File("Tuesday/test3.txt");
		InputStream inputStream = null;
		byte[] by = new byte[(int) file.length()];
		try {
			inputStream = new FileInputStream(file);
			inputStream.read(by);
		} catch (Exception e) {
			// TODO: handle exception

		} finally {
			inputStream.close();
		}

		OutputStream outputStream2 = null;
		outputStream2 = new FileOutputStream(file2);
		outputStream2.write(by);

	}

}
