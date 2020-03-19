package RandNum;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
* @author DaydreaminE
* @version 创建时间：2020年3月19日 下午9:58:03
* 类说明
*/
public class Rand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list =new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9","10",
				"11","12","13","14","15","16","17","18","19","20"));

		for (int j = 0; j < 10; j++) {
			Random random = new Random();
			String randNum = list.get(random.nextInt(list.size()));
				//	list.remove(randNum);
			System.out.print(randNum+" ");
		}
	}

}
