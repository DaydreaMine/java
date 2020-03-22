import java.io.UnsupportedEncodingException;

/**
* @author DaydreaminE
* @version 创建时间：2020年3月17日 上午9:31:20
* 类说明
*/
public class jiequ {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str ="我ABC汉DEF";
		str=subStr(str, 8);
		System.out.println(str);
		
	}
	
	public static String subStr(String str , int length) throws UnsupportedEncodingException {
		byte[] by = str.getBytes("GBK");
		int len = by.length;
		
		if (str==null) {
			return null;
		}
		if("".equals(str)) {
			return "";
		}
		//如果 指定长度超过字符串本身长度，length默认长度就是字符串长度
		if (len<length) {
			length=str.length();
		}
		String st;
		
		if(by[length]<0) {
			st=new String(by, 0, --length,"GBK");
		}else {
			st = new String(by, 0, length,"GBK");
		}
		return st;
	}
}
