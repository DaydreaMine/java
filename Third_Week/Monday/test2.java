/**
 * @author DaydreaminE
 * @version 创建时间：2020年3月16日 下午6:51:00 类说明
 */
public class test2 {
	/*
	 * 
	 * 
	 * 
	 * 4. "。 面试题：5. 编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截取的字符串。
	 * 但是要保证汉字不被截半个，如“我ABC”4，应该截为“我AB”，输入“我ABC汉DEF”，6， 应该输出为“我ABC”而不是“我ABC+汉的半个”。
	 */
	// 1:需求：请设计一个方法，可以实现获取任意范围内的随机数。
	public void random(int first, int last) {
		int number = 0;
		if (first > last) {
			number = (int) (Math.random() * (first - last) + last);
		} else {
			number = (int) (Math.random() * (last - first) + first);
		}
	}

	// 3.将字符串中指定部分进行反转。
	public static String st(String str, int start, int end) {
		String str1 = str.substring(start, end + 1);
		StringBuffer str_reverse = new StringBuffer(str1);
		str_reverse.reverse();
		String str_start = str.substring(0, start);
		String str_end = str.substring(end + 1);
		String str5 = str_start + str_reverse.toString() + str_end;
		return str5;
	}

	// 2.定义一个StringBuffer类对象，1）使用append方法向对象中添加26个字母，并倒序遍历输入,2）删除前五个字符
	public static void main(String[] args) {
		StringBuffer A = new StringBuffer();
		char word = 'A';
		for (int i = 0; i < 25; i++) {
			A.append(word);
			word = (char) (word + 1);
		}
		System.out.println(A);
		System.out.println(A.reverse());
		System.out.println(A.delete(0, 4));

		String str = "abcdefg";
		System.out.println(st(str, 0, 3));

		//编写一个程序，将下面的一段文本中的各个单词的字母顺序翻转， “To be or not to be"
		
		String str1 = "To be or not to be";
		StringBuffer to = new StringBuffer(str1);
		
		 
	}
}
