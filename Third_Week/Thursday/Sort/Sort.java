package Sort;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * @author DaydreaminE
 * @version 创建时间：2020年3月19日 下午9:23:53 类说明
 */
public class Sort implements Comparable {
	
	private String fruits;
	
	public Sort(String fruits) {
		this.fruits= fruits;
	}

	public String getFruits() {
		return fruits;
	}

	public void setFruits(String fruits) {
		this.fruits = fruits;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Sort sort = (Sort)o;
		int num = this.fruits.length()-sort.fruits.length();
		int num1 =     num ==0?this.fruits.compareTo(sort.fruits):num;
		return num1;
	}

}
