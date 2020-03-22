import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
* @author DaydreaminE
* @version 创建时间：2020年3月18日 下午1:33:09
* 类说明
*/
/*
 * 选择
 * 1~5 ABBDC   6~10 C(CD)B(BD)C    11~15 (11全对)(ABCD)CCB   16~20 CDCD(BC)
 * 21~25 (CD)(CD)(CE)BB    26~30 DDCAC
 * 分析
 * 1. Aclass  Aclass Bclass
 * 2. 2❌  //编译出错
 * 3. 4,5
 * 4. 2
 * 5. 0+1+3+5+7+9=25
 * 6. Base.amethod()   1  Descend.amethod()
 * 7. Finally   
 *    ExceptionFinished
 * 8.  
 *     1a2b 
 *     2b
 * 9. 奔驰在跑
 * 10.ArithmeticException异常， Exception异常， finally
 *  简答
 *  1.java中构造方法的功能和特点，构造方法和一般方法的区别？
 *    构造方法简单的来说是给对象的数据进行初始化的，方法名和类名相同，没有返回类型和具体的返回值，可以被重载
 *    每个类中必须有一个或多个构造方法，系统在你没创建构造方法时默认创建一个无参构造方法，而一般方法没有这特点。
 *    
 *  2. java中的访问控制符包含哪些？各访问控制符的作用？
 *    访问控制符：public        任意包的任意类都可以访问
 *              protected 可以在不同包的子类中访问  其他的类不能访问
 *              默认          只能在同一个包的子类中访问
 *              private      只能在本类中访问
 *               
 *   3.构造方法可以重载，重写吗？
 *     可以重载，但不可以重写,因为构造方法不能被继承
 *   
 *   4、方法的重载和方法的重写的区别？
 *     重载：同类方法名一致，返回值一致，但参数列表不一致是重载，
 *     重写子类和父类方法名，返回值，参数列表一样是重写
 *     
 *   5、this和super的作用以及this()和super()的区别
 *       super表示父类对象，super()表示对父类对象的构造器的引用
 *       this表示当前对象     this（）表示当前对象的无参构造器
 *   
 *   6、接口是否可继承接口? 抽象类是否可实现(implements)接口? 抽象类是否可继承实体类(concrete class)?
 *      接口可以继承接口，抽象类可以实现接口也可以继承实体类
 *      
 *   7、是否可以继承String类?为什么? 
 *     不可以，因为String类有final修饰符，而被final修饰不能被继承的。
 *   
 *   8、静态变量和实例变量的区别？
 *   静态变量是属于类的变量，不用创建对象，就可以被加载分配内存空间
 *   实例变量是属于对象的变量，只有创建了对象，实例变量才会被分配内存空间，从而被使用
 *   
 * 编程题(10+16)
 * */

  public class exam {
    public static void main(String[] args) {	
    	
 //1.输入1个四位数，将其加密后输出。方法是将该数每一位上的数字加9，然后除以10取余，做为该位上的新数字，最后将第1位和第3位上的数字互换，第2位和第4位上的数字互换，组成加密后的新数   	
      int[] arr = new int[4];
		int a = 0;
		System.out.println("输入一个四位数");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num < 1000 || num > 10000) {
			System.out.println("请输入一个四位数！");
		} else {
			for (int i = 0; i < 4; i++) {
				a = num % 10;
				num = num / 10;
				arr[3 - i] = (a + 9) % 10;
			}
			int temp = arr[0];
			arr[0] = arr[2];
			arr[2] = temp;
			temp = arr[1];
			arr[1] = arr[3];
			arr[3] = temp;
			System.out.println("加密后的数为：");
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[j]);		
			}
			System.out.println();
		}

	
	  //2.斗地主小游戏
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
