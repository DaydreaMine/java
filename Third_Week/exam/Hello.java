import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
* @author DaydreaminE
* @version 创建时间：2020年3月18日 下午3:02:51
* 类说明
*/
public class Hello {
	
	public static void main(String[] arg) {
		ArrayList<String> list =new ArrayList<>(Arrays.asList(
				"♣️A","♣️️️2","♣3","♣4","♣5","♣6","♣7","♣8","♣9","♣10","♣J","♣Q","♣K",
				"️♦A","♦2","♦️️️3","♦️4","♦️5","♦️6","♦️7","♦️8","♦️9","♦️10","♦️J","♦️Q","♦️K",
				"♥A","️️️♥2","♥3","♥4","♥5","♥6","♥7","♥8","♥9","♥10","♥J","♥Q","♥K",
				"♠A","♠2","♠3","♠4","♠5","♠6","♠7","♠8","♠9","♠10","♠J","♠Q","♠K","大王","小王"));
		for (int i = 0; i < 3; i++) {	
			System.out.println("第"+(i+1)+"个人的牌是：");
		for (int j = 0; j < 17; j++) {
			Random rand = new Random();
			String randCard = list.get(rand.nextInt(list.size()));
			list.remove(randCard);
			System.out.print(randCard+" ");
		}
		System.out.println();
		}
		System.out.println(list.toString());
				
		}

}
