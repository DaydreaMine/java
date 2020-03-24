import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
* @author DaydreaminE
* @version 创建时间：2020年3月24日 下午5:33:54
* 类说明
*/
public class FileTxt {
	//找到指定文件及其子目录下面的所有的txt文件,并且把满足条件的文件全部读取出来写入到另一个txt文件里面去(使用地柜完成)

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/user/JAVA/Fourth_Week");
		File[] files = file.listFiles();
        FileWriter fileWriter = new FileWriter("test.txt");
        for (File file2 : files) {
			if(!file2.isFile()) {
			 
			}
		}
        
	}
}
