package Number;
/**
* @author DaydreaminE
* @version 创建时间：2020年3月23日 下午10:05:31
* 类说明
*/
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Array<Integer> ar1 = new Array<Integer>(new Integer[] {1,2,3,4,5,});
		
		Array<Double> ar2 = new Array<Double>(new Double[] {3.2,3.3,3.1,4.5,4.8});
		
		ar1.max();
		ar1.min();
		ar1.avg();
		
		ar2.max();
		ar2.min();
		ar2.avg();
	}

}
