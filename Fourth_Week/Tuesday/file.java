

/**
* @author DaydreaminE
* @version 创建时间：2020年3月24日 下午5:05:51
* 类说明
*/

//找指定文件夹下的java文件
import java.io.File;
import java.io.FilenameFilter;

public class file {

	public static void main(String[] args) {
		File file = new File("/Users/user/JAVA/Fourth_Week/Monday/Dao");
		String[] strfile = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				if (name.endsWith(".java")) {
					return true;
				} else {
					return false;
				}
			}
		});

		for (String str : strfile) {
			System.out.println(str);
		}
	}
}