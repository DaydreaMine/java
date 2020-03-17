package Score;

import java.util.Scanner;

/**
 * @author DaydreaminE
 * @version 创建时间：2020年3月17日 下午4:39:42 类说明
 */

class ScoreException extends Exception {
	public ScoreException() {
		super();
	}

	public ScoreException(String message) {
		super(message);
	}
}

public class ScoreTest {
	public static void main(String[] args) throws ScoreException {
		System.out.println("输入成绩:");
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		Score(num);

	}

	public static void Score(double num) throws ScoreException {
		if (num < 0 || num > 100) {
			throw new ScoreException("分数必须在0～100之间");
		} else {
			System.out.println(num);
		}
	}
}
