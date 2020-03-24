import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author DaydreaminE
 * @version 创建时间：2020年3月24日 下午6:05:04 类说明
 */
public class ByteStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("Tuesday/test1.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < 19; i++) {
			list.add("A"+i);
		}
		
		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(file);
			for (int i = 0; i < list.size(); i++) {
				outputStream.write(list.get(i).getBytes());
				if(i!=list.size()-1) {
					if((i+1)%5!=0) {
						outputStream.write(",".getBytes());
					}else {
						outputStream.write("\n".getBytes());
					}
				}else {
					outputStream.write(".".getBytes());
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				outputStream.close();
			} catch (IOException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

	}

}
