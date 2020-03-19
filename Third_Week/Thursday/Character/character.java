package Character;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author DaydreaminE
 * @version 创建时间：2020年3月19日 下午10:11:23 类说明
 */
public class character {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashSet<Character> has = new HashSet<>();
		System.out.println("请输入字符：");
		String c = sc.nextLine();
		char[] arr = c.toCharArray();
		
		for (Character character : arr) {
			has.add(character);
		}
		
		for (char d : has) {
			System.out.print(d);
			
		}
	}

}
