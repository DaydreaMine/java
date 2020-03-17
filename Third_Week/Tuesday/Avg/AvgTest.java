package Avg;

import java.util.Scanner;

/**
 * @author DaydreaminE
 * @version 创建时间：2020年3月17日 下午6:15:40 类说明
 */
public class AvgTest {

	public static void main(String[] args) throws AvgException {
		// TODO Auto-generated method stub
		int sum = 0;
		int num = 0;
		double avg = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("请输入第" + (i + 1) + "个数,必须是正数或输入0");
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
			try {
				checkNum(num);				
			} catch (AvgException e) {
				// TODO: handle exception
				System.out.println("N必须是正数或者0,再次输入:");
				i--;
				num = 0;
			}
			sum = sum+num;
		}
		
		avg = sum / 5;

	}

	public static void checkNum(int num) throws AvgException {
		if (num < 0) {
			throw new AvgException("N必须是正数或者0");
		}
	}

}
