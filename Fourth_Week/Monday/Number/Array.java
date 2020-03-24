package Number;

/**
* @author DaydreaminE
* @version 创建时间：2020年3月23日 下午8:52:33
* 类说明
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Array<T extends Number> {

	private T[] array;

	public Array(T[] array) {
		super();
		this.array = array;
	}

	public Array() {
		super();
	}

	public void min() {
		T min = this.array[0];
		for (int i = 1; i < array.length; i++) {
			if (Double.parseDouble(array[i].toString())<Double.parseDouble(min.toString())){
				min = array[i];
			}
		}
		System.out.println("最小值：" + min);
	}

	public void max() {
		Arrays.sort(array, new Comparator<T>() {
			@Override
			public int compare(T o1, T o2) {
				// TODO Auto-generated method stub
				int len1 = o1.toString().length();
				int len2 = o2.toString().length();
				int num = len1 - len2;
				int num2 = num == 0 ? o1.toString().compareTo(o2.toString()) : num;
				return num2;
			}
		});
	}

	public void avg() {
		double avg = 0;
		double num = 0;
		for (int i = 0; i < array.length; i++) {
			num += array[i].doubleValue();
		}
		avg = num / array.length;
		System.out.println("平均值：" + avg);
	}

}
